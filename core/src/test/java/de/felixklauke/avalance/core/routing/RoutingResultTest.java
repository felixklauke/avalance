package de.felixklauke.avalance.core.routing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class RoutingResultTest {

    private static final String HOSTNAME = "felix-klauke.de";

    private static final int PORT = 22;

    private RoutingResult routingResult;

    @Before
    public void setUp() {
        routingResult = new RoutingResult(HOSTNAME, PORT);
    }

    @Test
    public void getHostName() {
        assertEquals(HOSTNAME, routingResult.getHostName());
    }

    @Test
    public void getPort() {
        assertEquals(PORT, routingResult.getPort());
    }

    @Test
    public void getMetadata() {
        assertTrue(routingResult.getMetadata().isEmpty());
    }
}
