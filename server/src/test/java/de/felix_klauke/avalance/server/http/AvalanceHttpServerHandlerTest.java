package de.felix_klauke.avalance.server.http;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.*;
import io.netty.handler.codec.DecoderResult;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.EventExecutor;
import org.junit.Before;
import org.junit.Test;

import java.net.SocketAddress;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class AvalanceHttpServerHandlerTest {

    private AvalanceHttpServerHandler avalanceHttpServerHandler;

    @Before
    public void setUp() {
        avalanceHttpServerHandler = new AvalanceHttpServerHandler();
    }

    @Test
    public void channelRead0() {
        try {
            avalanceHttpServerHandler.channelRead0(new ChannelHandlerContext() {
                @Override
                public Channel channel() {
                    return null;
                }

                @Override
                public EventExecutor executor() {
                    return null;
                }

                @Override
                public String name() {
                    return null;
                }

                @Override
                public ChannelHandler handler() {
                    return null;
                }

                @Override
                public boolean isRemoved() {
                    return false;
                }

                @Override
                public ChannelHandlerContext fireChannelRegistered() {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireChannelUnregistered() {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireChannelActive() {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireChannelInactive() {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireExceptionCaught(Throwable cause) {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireUserEventTriggered(Object evt) {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireChannelRead(Object msg) {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireChannelReadComplete() {
                    return null;
                }

                @Override
                public ChannelHandlerContext fireChannelWritabilityChanged() {
                    return null;
                }

                @Override
                public ChannelHandlerContext read() {
                    return null;
                }

                @Override
                public ChannelHandlerContext flush() {
                    return null;
                }

                @Override
                public ChannelPipeline pipeline() {
                    return null;
                }

                @Override
                public ByteBufAllocator alloc() {
                    return null;
                }

                @Override
                public <T> Attribute<T> attr(AttributeKey<T> key) {
                    return null;
                }

                @Override
                public <T> boolean hasAttr(AttributeKey<T> key) {
                    return false;
                }

                @Override
                public ChannelFuture bind(SocketAddress localAddress) {
                    return null;
                }

                @Override
                public ChannelFuture connect(SocketAddress remoteAddress) {
                    return null;
                }

                @Override
                public ChannelFuture connect(SocketAddress remoteAddress, SocketAddress localAddress) {
                    return null;
                }

                @Override
                public ChannelFuture disconnect() {
                    return null;
                }

                @Override
                public ChannelFuture close() {
                    return null;
                }

                @Override
                public ChannelFuture deregister() {
                    return null;
                }

                @Override
                public ChannelFuture bind(SocketAddress localAddress, ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture connect(SocketAddress remoteAddress, ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture connect(SocketAddress remoteAddress, SocketAddress localAddress, ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture disconnect(ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture close(ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture deregister(ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture write(Object msg) {
                    return null;
                }

                @Override
                public ChannelFuture write(Object msg, ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture writeAndFlush(Object msg, ChannelPromise promise) {
                    return null;
                }

                @Override
                public ChannelFuture writeAndFlush(Object msg) {
                    return null;
                }

                @Override
                public ChannelPromise newPromise() {
                    return null;
                }

                @Override
                public ChannelProgressivePromise newProgressivePromise() {
                    return null;
                }

                @Override
                public ChannelFuture newSucceededFuture() {
                    return null;
                }

                @Override
                public ChannelFuture newFailedFuture(Throwable cause) {
                    return null;
                }

                @Override
                public ChannelPromise voidPromise() {
                    return null;
                }
            }, new HttpRequest() {
                @Override
                public HttpMethod getMethod() {
                    return null;
                }

                @Override
                public HttpMethod method() {
                    return null;
                }

                @Override
                public HttpRequest setMethod(HttpMethod method) {
                    return null;
                }

                @Override
                public String getUri() {
                    return null;
                }

                @Override
                public String uri() {
                    return null;
                }

                @Override
                public HttpRequest setUri(String uri) {
                    return null;
                }

                @Override
                public HttpRequest setProtocolVersion(HttpVersion version) {
                    return null;
                }

                @Override
                public HttpVersion getProtocolVersion() {
                    return null;
                }

                @Override
                public HttpVersion protocolVersion() {
                    return null;
                }

                @Override
                public HttpHeaders headers() {
                    return null;
                }

                @Override
                public DecoderResult getDecoderResult() {
                    return null;
                }

                @Override
                public void setDecoderResult(DecoderResult result) {

                }

                @Override
                public DecoderResult decoderResult() {
                    return null;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}