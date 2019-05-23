package de.felixklauke.avalance.server;

import de.felixklauke.avalance.core.routing.RouterContext;
import de.felixklauke.avalance.core.routing.RouterRequest;
import de.felixklauke.avalance.server.config.AvalanceServerConfig;
import de.felixklauke.avalance.server.http.NettyRouterContext;
import de.felixklauke.avalance.server.http.NettyRouterRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceServerImplTest {

    private AvalanceServer avalanceServer;

    @Before
    public void setUp() {
        avalanceServer = AvalanceServerFactory.createAvalanceServer(new AvalanceServerConfig("127.0.0.1"));
    }

    @Test
    public void processRequest() {
        ChannelHandlerContext channelHandlerContext = Mockito.mock(ChannelHandlerContext.class);
        HttpRequest httpRequest = Mockito.mock(HttpRequest.class);

        RouterContext routerContext = new NettyRouterContext(channelHandlerContext, httpRequest);
        RouterRequest routerRequest = new NettyRouterRequest(httpRequest);
        avalanceServer.processRequest(routerContext, routerRequest);

        // TODO: Assertions
    }
}
