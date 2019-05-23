package de.felix_klauke.avalance.server.http;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@RunWith(MockitoJUnitRunner.class)
public class NettyRouterRequestTest {

    @Mock
    HttpRequest httpRequest;

    private NettyRouterRequest nettyRouterRequest;

    @Before
    public void setUp() {
        nettyRouterRequest = new NettyRouterRequest(httpRequest);
    }

    @Test
    public void dummy() {

    }
}
