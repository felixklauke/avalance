package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceConfig;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceImpl implements Avalance {

    private final AvalanceConfig avalanceConfig;

    public AvalanceImpl(AvalanceConfig avalanceConfig) {
        this.avalanceConfig = avalanceConfig;
    }
}
