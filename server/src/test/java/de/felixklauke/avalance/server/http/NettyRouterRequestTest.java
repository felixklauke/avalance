package de.felixklauke.avalance.server.http;

import io.netty.handler.codec.http.DefaultHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NettyRouterRequestTest {

    private HttpRequest httpRequest;
    private NettyRouterRequest nettyRouterRequest;

    @BeforeEach
    void setUp() {
         httpRequest = new DefaultHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "");
         nettyRouterRequest = new NettyRouterRequest(httpRequest);
    }

    @Test
    void testGetHttpRequest() {
        HttpRequest httpRequest = nettyRouterRequest.getHttpRequest();
        assertEquals(this.httpRequest, httpRequest);
    }
}
