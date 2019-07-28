package de.felixklauke.avalance.server;

import de.felixklauke.avalance.core.routing.RouterContext;
import de.felixklauke.avalance.core.routing.RouterRequest;

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
