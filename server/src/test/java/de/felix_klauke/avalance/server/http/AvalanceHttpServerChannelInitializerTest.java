package de.felix_klauke.avalance.server.http;

import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceHttpServerChannelInitializerTest {

    private final SocketChannel socketChannel = new NioSocketChannel();
    private AvalanceHttpServerChannelInitializer channelInitializer;

    @Before
    public void setUp() {
        channelInitializer = new AvalanceHttpServerChannelInitializer(avalanceServer);
    }

    @Test
    public void initChannel() {
        try {
            channelInitializer.initChannel(socketChannel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(3, socketChannel.pipeline().toMap().size());
    }
}