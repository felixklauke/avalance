package de.felix_klauke.avalance.server.http;

import de.felix_klauke.avalance.core.routing.RouterRequest;
import io.netty.handler.codec.http.HttpRequest;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class NettyRouterRequest extends RouterRequest {

    /**
     * Create a new router request.
     *
     * @param httpRequest The http request.
     */
    public NettyRouterRequest(HttpRequest httpRequest) {
        super();
    }
}
