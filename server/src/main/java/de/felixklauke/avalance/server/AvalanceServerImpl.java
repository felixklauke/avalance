package de.felixklauke.avalance.server;

import de.felixklauke.avalance.core.Avalance;
import de.felixklauke.avalance.core.routing.RouterContext;
import de.felixklauke.avalance.core.routing.RouterRequest;
import de.felixklauke.avalance.server.config.AvalanceServerConfig;
import de.felixklauke.avalance.server.http.AvalanceHttpServer;
import de.felixklauke.avalance.server.http.AvalanceNettyHttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The basic implementation of the {@link AvalanceServer}.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceServerImpl implements AvalanceServer {

  /**
   * The logger to log all server actions.
   */
  private final Logger logger = LoggerFactory.getLogger(AvalanceServerImpl.class);

  /**
   * The server config.
   */
  private final AvalanceServerConfig avalanceServerConfig;

  /**
   * The internal avalance instance.
   */
  private final Avalance avalance;

  /**
   * The http server.
   */
  private final AvalanceHttpServer avalanceHttpServer;

  /**
   * Create a new server instance.
   *
   * @param avalanceServerConfig The avalance server config.
   * @param avalance The avalance instance.
   */
  AvalanceServerImpl(AvalanceServerConfig avalanceServerConfig, Avalance avalance) {
    this.avalanceServerConfig = avalanceServerConfig;
    this.avalance = avalance;
    this.avalanceHttpServer = new AvalanceNettyHttpServer(this);
  }

  @Override
  public void processRequest(RouterContext routerContext, RouterRequest routerRequest) {
    avalance.processRequest(routerContext, routerRequest);
  }
}
