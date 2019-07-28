package de.felixklauke.avalance.core;

import de.felixklauke.avalance.core.config.AvalanceCoreConfig;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceFactory {

  AvalanceFactory() {
    throw new AssertionError("You should not initialize factories.");
  }

  public static Avalance createAvalance(AvalanceCoreConfig avalanceCoreConfig) {
    return new AvalanceImpl(avalanceCoreConfig);
  }
}
