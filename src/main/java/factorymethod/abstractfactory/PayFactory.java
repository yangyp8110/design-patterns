package factorymethod.abstractfactory;

/**
 * Created by mr.yang on 2018/9/17.
 */
public class PayFactory {
    private IPay pay;
    private IScore score;

    public PayFactory(AbstractFactory factory) {
        this.pay = factory.createPay();
        this.score = factory.createScore();
    }

    public void pay() {
        this.pay.pay();
        this.score.getScore();
    }
}
