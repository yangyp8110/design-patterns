package factorymethod.abstractfactory;

import java.util.Random;

/**
 * Created by mr.yang on 2018/9/17.
 */
public class AliPayScore extends IScore {
    @Override
    public void getScore() {
        System.out.println("支付宝支付成功，获取" + new Random().nextInt(10) + "元返现，并获取1个蚂蚁积分");
    }
}
