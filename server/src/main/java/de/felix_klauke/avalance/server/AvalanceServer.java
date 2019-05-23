package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.core.routing.RouterContext;
import de.felix_klauke.avalance.core.routing.RouterRequest;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface AvalanceServer {

    /**
     * Process the given request in the given context.
     *
     * @param routerContext The context.
     * @param routerRequest The request.
     */
    void processRequest(RouterContext routerContext, RouterRequest routerRequest);
}
