package de.felixklauke.avalance.server.utils;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.internal.PlatformDependent;

/**
 * @author Felix 'SasukeKawaii' Klauke
 */
public class NettyUtils {

    NettyUtils() {
        throw new AssertionError("You should not initialize util classes.");
    }

    private static final boolean EPOLL = !PlatformDependent.isWindows() && Epoll.isAvailable();

    public static EventLoopGroup createEventLoopGroup(int threadAmount) {
        return EPOLL ? new EpollEventLoopGroup(threadAmount) : new NioEventLoopGroup(threadAmount);
    }

    public static Class<? extends ServerChannel> getServerChannelClass() {
        return EPOLL ? EpollServerSocketChannel.class : NioServerSocketChannel.class;
    }

    public static Class<? extends Channel> getChannel() {
        return EPOLL ? EpollSocketChannel.class : NioSocketChannel.class;
    }

    public static boolean isEpoll() {
        return EPOLL;
    }

    public static void closeWhenFlushed(Channel channel) {
        if (channel.isActive()) {
            channel.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
        }
    }
}
