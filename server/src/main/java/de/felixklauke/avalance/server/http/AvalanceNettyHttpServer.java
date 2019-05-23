package de.felixklauke.avalance.server.http;

import de.felixklauke.avalance.server.AvalanceServer;
import de.felixklauke.avalance.server.utils.NettyUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceNettyHttpServer implements AvalanceHttpServer {

    /**
     * The server we are working for.
     */
    private final AvalanceServer avalanceServer;

    /**
     * The netty server bootstrap.
     */
    private ServerBootstrap serverBootstrap;

    /**
     * The netty server bootstraps boss group.
     */
    private EventLoopGroup bossGroup;

    /**
     * The netty server bootstraps worker group.
     */
    private EventLoopGroup workerGroup;

    /**
     * Create a new netty based http server.
     *
     * @param avalanceServer The underlying avalance server.
     */
    public AvalanceNettyHttpServer(AvalanceServer avalanceServer) {
        this.avalanceServer = avalanceServer;
    }

    @Override
    public void start() {
        bossGroup = NettyUtils.createEventLoopGroup(1);
        workerGroup = NettyUtils.createEventLoopGroup(4);

        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workerGroup)
                .channel(NettyUtils.getServerChannelClass())
                .option(ChannelOption.SO_BACKLOG, 1024)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new AvalanceHttpServerChannelInitializer(avalanceServer));

        try {
            Channel channel = serverBootstrap.bind(8080).sync().channel();


            channel.closeFuture();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        bossGroup.shutdownNow();
        workerGroup.shutdownNow();
    }

    @Override
    public boolean isRunning() {
        return serverBootstrap != null && (!bossGroup.isShutdown() || !bossGroup.isShuttingDown()) && (!workerGroup.isShutdown() || !workerGroup.isShuttingDown());
    }
}
