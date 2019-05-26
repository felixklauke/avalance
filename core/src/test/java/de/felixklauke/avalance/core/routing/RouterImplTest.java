package de.felixklauke.avalance.core.routing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class RouterImplTest {

    private RouterImpl router;

    @BeforeEach
    public void setUp() {
        router = new RouterImpl();
    }

    @Test
    public void processRequest() {
        router.processRequest(new RouterContext(), new RouterRequest());
    }
}
