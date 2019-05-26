package de.felixklauke.avalance.core;

import de.felixklauke.avalance.core.config.AvalanceCoreConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testInit() {
        Executable executable = AvalanceFactory::new;
        assertThrows(AssertionError.class, executable);
    }
}
