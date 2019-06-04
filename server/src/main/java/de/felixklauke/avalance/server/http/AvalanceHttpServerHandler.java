package de.felixklauke.avalance.server.http;

import de.felixklauke.avalance.core.routing.RouterContext;
import de.felixklauke.avalance.core.routing.RouterRequest;
import de.felixklauke.avalance.server.AvalanceServer;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceHttpServerHandler extends SimpleChannelInboundHandler<HttpRequest> {

    /**
     * The avalance server.
     */
    private final AvalanceServer avalanceServer;

    /**
     * Create a new avalance http handler.
     *
     * @param avalanceServer The avalance server.
     */
    AvalanceHttpServerHandler(AvalanceServer avalanceServer) {
        this.avalanceServer = avalanceServer;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpRequest msg) {
        ctx.writeAndFlush(new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND))
                .addListener(ChannelFutureListener.CLOSE);

        RouterContext routerContext = new NettyRouterContext(ctx, msg);
        RouterRequest routerRequest = new NettyRouterRequest(msg);

        avalanceServer.processRequest(routerContext, routerRequest);
    }
}
