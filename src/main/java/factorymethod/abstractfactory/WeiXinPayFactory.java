package factorymethod.abstractfactory;

/**
 * Created by mr.yang on 2018/9/16.
 */
public class WeiXinPayFactory extends AbstractFactory {
    @Override
    public IPay createPay() {
        return new WeiXinPay();
    }

    @Override
    public IScore createScore() {
        return new WeiXinPayScore();
    }
}
