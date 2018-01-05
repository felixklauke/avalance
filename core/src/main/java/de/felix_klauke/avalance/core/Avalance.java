package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.routing.RouterContext;
import de.felix_klauke.avalance.core.routing.RouterRequest;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public interface Avalance {

    /**
     * Process the given request in the given context.
     *
     * @param routerContext The router context.
     * @param routerRequest The router request.
     */
    void processRequest(RouterContext routerContext, RouterRequest routerRequest);
}
