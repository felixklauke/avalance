package de.felixklauke.avalance.server.http;

import de.felixklauke.avalance.server.AvalanceServerFactory;
import de.felixklauke.avalance.server.config.AvalanceServerConfig;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceHttpServerChannelInitializerTest {

    private final SocketChannel socketChannel = new NioSocketChannel();
    private AvalanceHttpServerChannelInitializer channelInitializer;

    @Before
    public void setUp() {
        channelInitializer = new AvalanceHttpServerChannelInitializer(AvalanceServerFactory.createAvalanceServer(new AvalanceServerConfig("")));
    }

    @Test
    public void initChannel() {
        try {
            channelInitializer.initChannel(socketChannel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(4, socketChannel.pipeline().toMap().size());
    }
}
