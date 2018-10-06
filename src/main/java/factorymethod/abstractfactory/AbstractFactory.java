package factorymethod.abstractfactory;

/**
 * Created by mr.yang on 2018/9/16.
 */
public abstract class AbstractFactory {
    public abstract IPay createPay();
    public abstract IScore createScore();
}
