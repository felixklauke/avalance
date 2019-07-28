package de.felixklauke.avalance.core;

import de.felixklauke.avalance.core.routing.RouterContext;
import de.felixklauke.avalance.core.routing.RouterRequest;

/**
 * @author Felix Klauke <info@felix-klauke.de>
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
