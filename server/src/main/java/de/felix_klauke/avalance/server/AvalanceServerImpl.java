package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.core.Avalance;
import de.felix_klauke.avalance.server.config.AvalanceServerConfig;
import de.felix_klauke.avalance.server.http.AvalanceHttpServer;
import de.felix_klauke.avalance.server.http.AvalanceNettyHttpServer;

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
     * @param avalance             The avalance instance.
     * @param avalanceHttpServer   The http server.
     */
    AvalanceServerImpl(AvalanceServerConfig avalanceServerConfig, Avalance avalance) {
        this.avalanceServerConfig = avalanceServerConfig;
        this.avalance = avalance;
        this.avalanceHttpServer = new AvalanceNettyHttpServer(this);
    }
}
