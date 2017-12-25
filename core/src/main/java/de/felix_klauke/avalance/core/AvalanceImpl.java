package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceCoreConfig;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceImpl implements Avalance {

    private final AvalanceCoreConfig coreConfig;

    AvalanceImpl(AvalanceCoreConfig coreConfig) {
        this.coreConfig = coreConfig;
    }
}
