package factorymethod.standardfactory.paychannel;

import factorymethod.standardfactory.PayChannel;

/**
 * Created by mr.yang on 2018/9/15.
 */
public class WeXinPay extends PayChannel {
    @Override
    public void pay() {
        System.out.println("用微信支付……");
    }

    @Override
    public void desc() {
        System.out.println("用微信扫码支付……");
    }
}
