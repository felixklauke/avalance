package de.felixklauke.avalance.core.routing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class RouterContextTest {

    private RouterContext routerContext;

    @Before
    public void setUp() {
        routerContext = new RouterContext();
    }

    @Test
    public void getRoutingResult() {
        assertNotNull(routerContext.getRoutingResult());
    }

    @Test
    public void setRoutingResult() {
        RoutingResult routingResult = new RoutingResult("", 9000);

        assertNotEquals(routingResult, routerContext.getRoutingResult());

        routerContext.setRoutingResult(routingResult);

        assertEquals(routingResult, routerContext.getRoutingResult());
    }
}
