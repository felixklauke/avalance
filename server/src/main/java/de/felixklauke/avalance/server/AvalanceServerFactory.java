package de.felixklauke.avalance.server;

import de.felixklauke.avalance.core.AvalanceFactory;
import de.felixklauke.avalance.core.config.AvalanceCoreConfig;
import de.felixklauke.avalance.server.config.AvalanceServerConfig;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceServerFactory {

  AvalanceServerFactory() {
    throw new AssertionError("You should not initialize factories.");
  }

  public static AvalanceServer createAvalanceServer(AvalanceServerConfig avalanceServerConfig) {
    return new AvalanceServerImpl(avalanceServerConfig,
        AvalanceFactory.createAvalance(new AvalanceCoreConfig()));
  }
}
