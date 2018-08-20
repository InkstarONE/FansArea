package websocket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;

public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    //用于记录管理客户端
    private static ChannelGroup client = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    protected ChatHandler() {
        super();
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
       client.add(ctx.channel());//当客户端链接服务端之后 获取客户端channe了 放入 group管理
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
//        client.remove(ctx.channel());
        System.out.println("客户端断开 channle 长id："+ ctx.channel().id().asLongText());
        System.out.println("客户端断开 channle 短id："+ ctx.channel().id().asShortText());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame msg) throws Exception {
            String content = msg.text();
        System.out.println("接收到的数据" + content);

        for (Channel channel: client){
                channel.writeAndFlush(new TextWebSocketFrame("服务器接收到消息" + LocalDateTime.now() +"消息为" +content));

        }


    }
}
