package de.felixklauke.avalance.core.routing;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Data
public class RoutingResult {

    /**
     * The host name of the result service.
     */
    private final String hostName;

    /**
     * The port of the resulting service.
     */
    private final int port;

    /**
     * The meta data of the resulting service.
     */
    private final Map<String, Object> metadata = new HashMap<>();
}
