package de.felix_klauke.avalance.server.http;

/**
 * The central server receiving all http requests.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface AvalanceHttpServer {

    /**
     * Start the server.
     */
    void start();

    /**
     * Stop the server.
     */
    void stop();

    /**
     * Check if the server is running.
     *
     * @return If the server is running.
     */
    boolean isRunning();
}
