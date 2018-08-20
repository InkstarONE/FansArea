package helloServer;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;


//这是一个初始化器 channel注册后 执行初始化
public class HelloServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
            ChannelPipeline channelPipeline = channel.pipeline();
            //use pipe add handler
            channelPipeline.addLast("HttpServerCodec",new HttpServerCodec());
            //user zidingyi hanfler   返回netty
            channelPipeline.addLast("customHandler",new CustomHandler());
    }
}
