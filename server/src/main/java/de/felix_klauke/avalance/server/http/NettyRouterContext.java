package de.felix_klauke.avalance.server.http;

import de.felix_klauke.avalance.core.routing.RouterContext;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class NettyRouterContext extends RouterContext {

    /**
     * Create a new router context.
     *
     * @param ctx         The netty handler context.
     * @param httpRequest The http request.
     */
    public NettyRouterContext(ChannelHandlerContext ctx, HttpRequest httpRequest) {
        super();
    }
}
