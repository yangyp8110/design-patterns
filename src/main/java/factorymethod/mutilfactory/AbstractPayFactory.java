package factorymethod.mutilfactory;

import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/15.
 */
public abstract class AbstractPayFactory {
    public abstract PayChannel createPayChannel();
}