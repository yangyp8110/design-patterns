package factorymethod.abstractfactory;

/**
 * Created by mr.yang on 2018/9/17.
 */
public class WeiXinPay extends IPay {
    @Override
    public void pay() {
        System.out.println("微信发起支付申请……");
        System.out.println("微信通过指纹验证……");
        System.out.println("微信支付成功……");
    }
}
