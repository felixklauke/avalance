package de.felixklauke.avalance.core.routing;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class RouterImplTest {

    private RouterImpl router;

    @Before
    public void setUp() {
        router = new RouterImpl();
    }

    @Test
    public void processRequest() {
        router.processRequest(new RouterContext(), new RouterRequest());
    }
}
