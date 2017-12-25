package de.felix_klauke.avalance.server.config;

/**
 * Basic config of the avalance server module.
 *
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceServerConfig {

    /**
     * The basic resource route everything is built on.
     */
    private final String baseUrl;

    /**
     * Create a new Config.
     *
     * @param baseUrl The base url.
     */
    public AvalanceServerConfig(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Get the base url.
     *
     * @return The base url.
     */
    public String getBaseUrl() {
        return baseUrl;
    }
}
