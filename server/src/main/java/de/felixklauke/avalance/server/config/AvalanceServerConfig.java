package de.felixklauke.avalance.server.config;

import lombok.Data;

/**
 * Basic config of the avalance server module.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Data
public class AvalanceServerConfig {

  /**
   * The basic resource route everything is built on.
   */
  private final String baseUrl;

  /**
   * The host to listen on.
   */
  private final String host;

  /**
   * The port to bind.
   */
  private final int port;
}
