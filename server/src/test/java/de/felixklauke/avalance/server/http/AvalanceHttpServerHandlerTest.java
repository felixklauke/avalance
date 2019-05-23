package de.felixklauke.avalance.server.http;

import de.felixklauke.avalance.core.routing.RouterContext;
import de.felixklauke.avalance.core.routing.RouterRequest;
import de.felixklauke.avalance.server.AvalanceServer;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@RunWith(MockitoJUnitRunner.class)
public class AvalanceHttpServerHandlerTest {

    @Mock
    AvalanceServer avalanceServer;
    @Mock
    ChannelHandlerContext channelHandlerContext;
    @Mock
    HttpRequest httpRequest;

    private AvalanceHttpServerHandler avalanceHttpServerHandler;

    @Before
    public void setUp() {
        avalanceHttpServerHandler = new AvalanceHttpServerHandler(avalanceServer);
    }

    @Test
    public void channelRead0() {
        ChannelFuture channelFuture = Mockito.mock(ChannelFuture.class);

        Mockito.when(channelHandlerContext.writeAndFlush(Mockito.any(HttpResponse.class))).thenReturn(channelFuture);

        try {
            avalanceHttpServerHandler.channelRead0(channelHandlerContext, httpRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Mockito.verify(avalanceServer).processRequest(Mockito.any(RouterContext.class), Mockito.any(RouterRequest.class));
    }
}
