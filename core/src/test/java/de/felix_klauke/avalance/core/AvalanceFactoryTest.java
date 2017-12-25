package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceConfig;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceFactoryTest {

    @Test
    public void createAvalance() {
        AvalanceConfig avalanceConfig = new AvalanceConfig();
        Avalance avalance = AvalanceFactory.createAvalance(avalanceConfig);

        assertNotNull(avalance);
    }
}