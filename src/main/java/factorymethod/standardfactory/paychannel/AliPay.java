package factorymethod.standardfactory.paychannel;

import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/15.
 */
public class AliPay extends PayChannel {
    @Override
    public void pay() {
        System.out.println("用支付宝支付……");
    }

    @Override
    public void desc() {
        System.out.println("用支付宝扫码支付……");
    }
}
