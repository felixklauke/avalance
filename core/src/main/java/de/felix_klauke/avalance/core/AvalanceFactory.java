package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceCoreConfig;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceFactory {

    public static Avalance createAvalance(AvalanceCoreConfig avalanceCoreConfig) {
        return new AvalanceImpl(avalanceCoreConfig);
    }
}
