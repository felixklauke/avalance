package de.felix_klauke.avalance.server.http;

import de.felix_klauke.avalance.server.AvalanceServer;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.logging.LoggingHandler;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceHttpServerChannelInitializer extends ChannelInitializer<SocketChannel> {

    /**
     * The avalance server.
     */
    private final AvalanceServer avalanceServer;

    /**
     * Create a new channel initializer.
     *
     * @param avalanceServer The avalance server.
     */
    AvalanceHttpServerChannelInitializer(AvalanceServer avalanceServer) {
        this.avalanceServer = avalanceServer;
    }

    @Override
    protected void initChannel(SocketChannel ch) {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new HttpRequestDecoder());
        pipeline.addLast(new HttpResponseEncoder());
        pipeline.addLast(new LoggingHandler());
        pipeline.addLast(new AvalanceHttpServerHandler(avalanceServer));
    }
}
