package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.core.routing.Router;
import de.felix_klauke.avalance.core.routing.RouterImpl;
import de.felix_klauke.avalance.server.config.AvalanceServerConfig;

/**
 * The basic implementation of the {@link AvalanceServer}.
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceServerImpl implements AvalanceServer {

    /**
     * The server config.
     */
    private final AvalanceServerConfig avalanceServerConfig;

    /**
     * The router that will route all requests.
     */
    private final Router router;

    /**
     * Create a new server instance.
     *
     * @param avalanceServerConfig The avalance server config.
     */
    AvalanceServerImpl(AvalanceServerConfig avalanceServerConfig) {
        this.avalanceServerConfig = avalanceServerConfig;
        this.router = new RouterImpl();
    }
}
