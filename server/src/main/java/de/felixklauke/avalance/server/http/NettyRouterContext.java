package de.felixklauke.avalance.server.http;

import de.felixklauke.avalance.core.routing.RouterContext;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NettyRouterContext extends RouterContext {

  /**
   * The channel handler context from netty.
   */
  private final ChannelHandlerContext ctx;

  /**
   * The http request by netty.
   */
  private final HttpRequest httpRequest;

  /**
   * Create a new router context.
   *
   * @param ctx The netty handler context.
   * @param httpRequest The http request.
   */
  public NettyRouterContext(ChannelHandlerContext ctx, HttpRequest httpRequest) {
    super();
    this.ctx = ctx;
    this.httpRequest = httpRequest;
  }

  /**
   * Get the handler context of netty.
   *
   * @return The channel handler context.
   */
  public ChannelHandlerContext getCtx() {
    return ctx;
  }
}
