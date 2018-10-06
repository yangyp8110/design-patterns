package factorymethod.mutilfactory;

import factorymethod.standardfactory.paychannel.AliPay;
import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/16.
 */
public class AliPayFactory extends AbstractPayFactory {
    @Override
    public PayChannel createPayChannel() {
        AliPay pay = new AliPay();
        /**做一些不同的初始化*/
        pay.desc();
        return pay;
    }
}
