package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.server.config.AvalanceServerConfig;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceServerFactory {

    AvalanceServerFactory() {
        throw new AssertionError("You should not initialize factories.");
    }

    public static AvalanceServer createAvalanceServer(AvalanceServerConfig avalanceServerConfig) {
        return new AvalanceServerImpl(avalanceServerConfig);
    }
}
