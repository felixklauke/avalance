package de.felixklauke.avalance.core.routing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class SkeletonRoutingResultTest {

    private SkeletonRoutingResult skeletonRoutingResult;

    @Before
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
