package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceConfig;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceFactory {

    public static Avalance createAvalance(AvalanceConfig avalanceConfig) {
        return new AvalanceImpl(avalanceConfig);
    }
}
