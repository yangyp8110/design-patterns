package factorymethod.simplefactory;

import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/15.
 */
public class SimpleFactory {
    public static  <T extends PayChannel> PayChannel createPayChannel(Class<T> c) {
        PayChannel channel = null;

        try {
            channel = (PayChannel) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //TODO:
        }
        return (T) channel;
    }
}
