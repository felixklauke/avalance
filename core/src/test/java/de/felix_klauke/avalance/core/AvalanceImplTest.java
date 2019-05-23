package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceCoreConfig;
import org.junit.Before;

import static org.junit.Assert.*;

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
