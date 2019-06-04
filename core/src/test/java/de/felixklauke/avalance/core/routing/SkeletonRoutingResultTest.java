package de.felixklauke.avalance.core.routing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class SkeletonRoutingResultTest {

    private SkeletonRoutingResult skeletonRoutingResult;

    @BeforeEach
    public void setUp() {
        skeletonRoutingResult = new SkeletonRoutingResult();
    }

    @Test
    public void testValues() {
        assertEquals("", skeletonRoutingResult.getHostName());
        assertEquals(-1, skeletonRoutingResult.getPort());
        assertTrue(skeletonRoutingResult.getMetadata().isEmpty());
    }
}
