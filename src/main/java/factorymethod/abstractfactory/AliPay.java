package factorymethod.abstractfactory;

/**
 * Created by mr.yang on 2018/9/17.
 */
public class AliPay extends IPay {
    @Override
    public void pay() {
        System.out.println("支付宝发起支付申请……");
        System.out.println("支付宝通过face验证……");
        System.out.println("支付宝支付成功……");
    }
}
