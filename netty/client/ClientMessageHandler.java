package netty.client;


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import netty.Message;

public class ClientMessageHandler extends SimpleChannelInboundHandler<Message> {

    private final CallBack callBack;

    public ClientMessageHandler(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Message message) throws Exception {
        callBack.call(message);
    }
}
