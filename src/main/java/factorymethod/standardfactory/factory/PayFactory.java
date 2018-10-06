package factorymethod.standardfactory.factory;

import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/15.
 */
public class PayFactory extends AbstractPayFactory {
    @Override
    public <T extends PayChannel> PayChannel createPayChannel(Class<T> c) {
        PayChannel channel = null;

        try {
            channel = (PayChannel) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //TODO:
        }
        return (T) channel;
    }
}
