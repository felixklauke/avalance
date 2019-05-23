package de.felixklauke.avalance.core;

import de.felixklauke.avalance.core.config.AvalanceCoreConfig;
import org.junit.Before;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceImplTest {

    private Avalance avalance;

    @Before
    public void setUp() throws Exception {
        AvalanceCoreConfig coreConfig = new AvalanceCoreConfig();
        avalance = AvalanceFactory.createAvalance(coreConfig);
    }
}
