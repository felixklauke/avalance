package de.felixklauke.avalance.core.routing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The basic representation of the routing flow.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RouterContext {

    /**
     * The result of the routing flow.
     */
    private RoutingResult routingResult = new SkeletonRoutingResult();
}
