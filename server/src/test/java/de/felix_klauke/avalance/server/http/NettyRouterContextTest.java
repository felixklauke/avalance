package de.felix_klauke.avalance.server.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
@RunWith(MockitoJUnitRunner.class)
public class NettyRouterContextTest {

    @Mock
    ChannelHandlerContext channelHandlerContext;
    @Mock
    HttpRequest httpRequest;

    private NettyRouterContext nettyRouterContext;

    @Before
    public void setUp() {
        nettyRouterContext = new NettyRouterContext(channelHandlerContext, httpRequest);
    }

    @Test
    public void getCtx() {
        assertEquals(channelHandlerContext, nettyRouterContext.getCtx());
    }
}