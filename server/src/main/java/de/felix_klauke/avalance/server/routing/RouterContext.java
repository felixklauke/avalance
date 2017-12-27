package de.felix_klauke.avalance.server.routing;

/**
 * The basic representation of the routing flow.
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class RouterContext {

    /**
     * The result of the routing flow.
     */
    private RoutingResult routingResult = new RoutingResult();

    /**
     * Get the result of the routing result.
     *
     * @return The result.
     */
    public RoutingResult getRoutingResult() {
        return routingResult;
    }

    /**
     * Set the result of the routing context.
     *
     * @param routingResult The result.
     */
    public void setRoutingResult(RoutingResult routingResult) {
        this.routingResult = routingResult;
    }
}
