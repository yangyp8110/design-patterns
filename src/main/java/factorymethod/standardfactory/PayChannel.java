package factorymethod.standardfactory;

/**
 * Created by mr.yang on 2018/9/15.
 * 在线购物支付
 */
public abstract class PayChannel {
    public void desc() {
        System.out.println("可以在线扫码支付……");
    }

    public abstract void pay();
}
