package de.felixklauke.avalance.core.routing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
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

    /**
     * Create a new routing result.
     *
     * @param hostName The host name.
     * @param port     The port.
     */
    public RoutingResult(String hostName, int port) {
        this.hostName = hostName;
        this.port = port;
    }

    /**
     * Get the host name of the resulting service.
     *
     * @return The host name.
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Get the port of the resulting service.
     *
     * @return The port.
     */
    public int getPort() {
        return port;
    }

    /**
     * Get the meta data of the resulting service.
     *
     * @return The meta data.
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }
}
