package de.felix_klauke.avalance.server.routing;

/**
 * The internal router that will process all requests.
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public interface Router {

    /**
     * Process the given request in the given context.
     *
     * @param routerContext The router context.
     * @param routerRequest The request itself.
     */
    void processRequest(RouterContext routerContext, RouterRequest routerRequest);
}
