package factorymethod.abstractfactory;

/**
 * Created by mr.yang on 2018/9/16.
 */
public class AliPayFactory extends AbstractFactory {
    @Override
    public IPay createPay() {
        return new AliPay();
    }

    @Override
    public IScore createScore() {
        return new AliPayScore();
    }
}
