package de.felix_klauke.avalance.server.utils;

import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class NettyUtilsTest {

    @Test
    public void createEventLoopGroup() {
        EventLoopGroup eventLoopGroup = NettyUtils.createEventLoopGroup(4);

        assertNotNull(eventLoopGroup);
    }

    @Test
    public void getServerChannelClass() {
        Class<? extends ServerChannel> serverChannelClass = NettyUtils.getServerChannelClass();

        assertNotNull(serverChannelClass);
    }

    @Test
    public void getChannel() {
        Class<? extends Channel> channel = NettyUtils.getChannel();

        assertNotNull(channel);
    }

    @Test
    public void isEpoll() {
        boolean epoll = NettyUtils.isEpoll();
    }

    @Test
    public void closeWhenFlushed() {
        Channel channel = new NioSocketChannel();

        EventLoopGroup eventExecutors = NettyUtils.createEventLoopGroup(1);
        eventExecutors.register(channel);

        NettyUtils.closeWhenFlushed(channel);
    }
}