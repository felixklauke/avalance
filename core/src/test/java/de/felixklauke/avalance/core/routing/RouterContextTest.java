package de.felixklauke.avalance.core.routing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class RouterContextTest {

  private RouterContext routerContext;

  @BeforeEach
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
