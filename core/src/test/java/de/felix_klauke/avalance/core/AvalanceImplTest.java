package de.felix_klauke.avalance.core;

import de.felix_klauke.avalance.core.config.AvalanceConfig;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceImplTest {

    private Avalance avalance;

    @Before
    public void setUp() throws Exception {
        AvalanceConfig avalanceConfig = new AvalanceConfig();
        avalance = AvalanceFactory.createAvalance(avalanceConfig);
    }
}