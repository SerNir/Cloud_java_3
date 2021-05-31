package netty.client;

import netty.Message;

@FunctionalInterface
public interface CallBack {
    void call(Message message);

}
