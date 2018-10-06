package factorymethod.mutilfactory;

import factorymethod.standardfactory.PayChannel;
import factorymethod.standardfactory.paychannel.WeXinPay;

/**
 * Created by mr.yang on 2018/9/16.
 */
public class WeiXinPayFactory extends AbstractPayFactory {
    @Override
    public PayChannel createPayChannel() {
        WeXinPay pay = new WeXinPay();
        /**做一些不同的初始化*/
        pay.desc();
        return pay;
    }
}
