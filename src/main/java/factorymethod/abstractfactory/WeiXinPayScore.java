package factorymethod.abstractfactory;

import java.util.Random;

/**
 * Created by mr.yang on 2018/9/17.
 */
public class WeiXinPayScore extends IScore {
    @Override
    public void getScore() {
        System.out.println("微信支付成功，获取" + new Random().nextInt(10) + "元返现");
    }
}
