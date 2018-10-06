package factorymethod.standardfactory.factory;

import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/15.
 */
public abstract class AbstractPayFactory {
    /**
     * 传入Enum、Class等告诉具体工厂需要返回一个什么支付渠道
     * @param c
     * @param <T>
     */
    public abstract <T extends PayChannel>  PayChannel createPayChannel(Class<T> c);
}