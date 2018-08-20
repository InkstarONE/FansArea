package websocket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class WServer {
    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup mainGroup = new NioEventLoopGroup();
        EventLoopGroup subGroup = new NioEventLoopGroup();
    try {

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(mainGroup, subGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new WSserverInitialzer());

        ChannelFuture future = serverBootstrap.bind(8088).sync();
        future.channel().closeFuture().sync();
    }finally {
        mainGroup.shutdownGracefully();
        subGroup.shutdownGracefully();
    }
    }
}
