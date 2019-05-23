package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.core.AvalanceFactory;
import de.felix_klauke.avalance.core.config.AvalanceCoreConfig;
import de.felix_klauke.avalance.server.config.AvalanceServerConfig;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceServerFactory {

    AvalanceServerFactory() {
        throw new AssertionError("You should not initialize factories.");
    }

    public static AvalanceServer createAvalanceServer(AvalanceServerConfig avalanceServerConfig) {
        return new AvalanceServerImpl(avalanceServerConfig, AvalanceFactory.createAvalance(new AvalanceCoreConfig()));
    }
}
