package de.felix_klauke.avalance.server.utils;

import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class NettyUtilsTest {

    @Test(expected = AssertionError.class)
    public void preventInit() {
        new NettyUtils();
    }

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
        Channel channel = Mockito.mock(Channel.class);

        Mockito.verifyNoMoreInteractions(channel);

        NettyUtils.closeWhenFlushed(channel);
    }

    @Test
    public void closeWhenFlushedWhielActive() {
        Channel channel = Mockito.mock(Channel.class);
        ChannelFuture channelFuture = Mockito.mock(ChannelFuture.class);

        Mockito.when(channel.isActive()).thenReturn(true);
        Mockito.when(channel.writeAndFlush(Mockito.any())).thenReturn(channelFuture);

        NettyUtils.closeWhenFlushed(channel);

        Mockito.verify(channel).writeAndFlush(Mockito.any(ByteBuf.class));
        Mockito.verify(channelFuture).addListener(Mockito.any(ChannelFutureListener.class));
    }

}