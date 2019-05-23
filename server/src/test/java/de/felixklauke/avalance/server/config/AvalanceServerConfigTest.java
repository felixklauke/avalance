package de.felixklauke.avalance.server.config;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceServerConfigTest {

    private static final String TEST_BASE_URL = "http://localhost:8080";
    private AvalanceServerConfig serverConfig;

    @Before
    public void setUp() throws Exception {
        serverConfig = new AvalanceServerConfig(TEST_BASE_URL);
    }

    @Test
    public void getBaseUrl() {
        assertEquals(TEST_BASE_URL, serverConfig.getBaseUrl());
    }
}
