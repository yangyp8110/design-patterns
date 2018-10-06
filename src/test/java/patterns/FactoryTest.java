package patterns;

import factorymethod.abstractfactory.AbstractFactory;
import factorymethod.abstractfactory.IPay;
import factorymethod.abstractfactory.IScore;
import factorymethod.mutilfactory.AliPayFactory;
import factorymethod.mutilfactory.WeiXinPayFactory;
import factorymethod.simplefactory.SimpleFactory;
import factorymethod.standardfactory.PayChannel;
import factorymethod.standardfactory.factory.AbstractPayFactory;
import factorymethod.standardfactory.factory.PayFactory;
import factorymethod.standardfactory.paychannel.AliPay;
import org.junit.Test;

/**
 * Created by mr.yang on 2018/9/15.
 */
public class FactoryTest {
    //标准工厂使用
    @Test
    public void testFactory(){
        AbstractPayFactory factory = new PayFactory();
        PayChannel payChannel = factory.createPayChannel(AliPay.class);
        payChannel.pay();
    }

    //简单工厂使用
    @Test
    public void testSimpleFactory(){
        PayChannel payChannel = SimpleFactory.createPayChannel(AliPay.class);
        payChannel.pay();
    }

    //多工厂使用
    @Test
    public void testMutilFactory(){
        PayChannel aliPay = (new AliPayFactory()).createPayChannel();
        aliPay.pay();

        PayChannel weiXinPay = (new WeiXinPayFactory()).createPayChannel();
        weiXinPay.pay();
    }

    //抽象工厂使用
    @Test
    public void testAbstractFactory(){
        AbstractFactory aliPayFactory = new factorymethod.abstractfactory.AliPayFactory();
        IPay alipay = aliPayFactory.createPay();
        IScore aliscore = aliPayFactory.createScore();
        alipay.pay();
        aliscore.getScore();

        AbstractFactory weiXinPayFactory = new factorymethod.abstractfactory.WeiXinPayFactory();
        IPay wxpay = weiXinPayFactory.createPay();
        IScore wxscore = weiXinPayFactory.createScore();
        wxpay.pay();
        wxscore.getScore();
    }

    //抽象工厂使用
    @Test
    public void testPayFactory(){
        AbstractFactory aliPayFactory = new factorymethod.abstractfactory.AliPayFactory();
        factorymethod.abstractfactory.PayFactory factory = new factorymethod.abstractfactory.PayFactory(aliPayFactory);
        factory.pay();
    }
}
