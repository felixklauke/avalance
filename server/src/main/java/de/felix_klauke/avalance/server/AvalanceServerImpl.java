package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.server.config.AvalanceServerConfig;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceServerImpl implements AvalanceServer {

    private final AvalanceServerConfig avalanceServerConfig;

    AvalanceServerImpl(AvalanceServerConfig avalanceServerConfig) {
        this.avalanceServerConfig = avalanceServerConfig;
    }
}
