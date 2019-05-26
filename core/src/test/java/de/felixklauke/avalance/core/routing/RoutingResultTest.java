package de.felixklauke.avalance.core.routing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class RoutingResultTest {

    private static final String HOSTNAME = "felix-klauke.de";

    private static final int PORT = 22;

    private RoutingResult routingResult;

    @BeforeEach
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
