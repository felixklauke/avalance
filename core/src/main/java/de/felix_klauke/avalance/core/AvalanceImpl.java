package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceCoreConfig;
import de.felix_klauke.avalance.core.routing.Router;
import de.felix_klauke.avalance.core.routing.RouterImpl;

/**
 * The default implementation of {@link Avalance}.
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceImpl implements Avalance {

    /**
     * The underlying core config.
     */
    private final AvalanceCoreConfig coreConfig;

    /**
     * The internal router.
     */
    private final Router router;

    /**
     * Create a new avalance instance.
     *
     * @param coreConfig The core config.
     */
    AvalanceImpl(AvalanceCoreConfig coreConfig) {
        this.coreConfig = coreConfig;
        this.router = new RouterImpl();
    }
}
