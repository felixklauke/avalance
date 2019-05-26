package de.felixklauke.avalance.core;

import de.felixklauke.avalance.core.config.AvalanceCoreConfig;
import org.junit.jupiter.api.BeforeEach;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceImplTest {

    private Avalance avalance;

    @BeforeEach
    public void setUp() throws Exception {
        AvalanceCoreConfig coreConfig = new AvalanceCoreConfig();
        avalance = AvalanceFactory.createAvalance(coreConfig);
    }
}
