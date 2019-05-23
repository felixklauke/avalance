package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceCoreConfig;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceFactoryTest {

    @Test
    public void createAvalance() {
        AvalanceCoreConfig coreConfig = new AvalanceCoreConfig();
        Avalance avalance = AvalanceFactory.createAvalance(coreConfig);

        assertNotNull(avalance);
    }

    @Test(expected = AssertionError.class)
    public void testInit() {
        new AvalanceFactory();
    }
}
