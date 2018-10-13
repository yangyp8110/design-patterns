package patterns;

import org.junit.Test;
import proxy.commonproxy.Cooker;
import proxy.commonproxy.CookerProxy;
import proxy.commonproxy.ICook;
import proxy.dynamicproxy.CookerDynamicProxy;
import proxy.dynamicproxy.CookerHandler;
import proxy.dynamicproxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by mr.yang on 2018/10/7.
 */
public class ProxyTest {
    @Test
    public void test() {
        Cooker cooker = new Cooker();
        ICook cook = new CookerProxy(cooker);
        cook.washFood();
        cook.cutFood();
        cook.stirFood();
    }

    @Test
    public void testForceProxy() {

        System.out.println("=============自己来做菜=================");

        proxy.forceproxy.Cooker cooker1 = new proxy.forceproxy.Cooker();
        cooker1.washFood();
        cooker1.cutFood();
        cooker1.stirFood();

        System.out.println("==============任意一个会做菜的人来做菜================");

        proxy.forceproxy.Cooker cooker2 = new proxy.forceproxy.Cooker();
        proxy.forceproxy.ICook cook = new proxy.forceproxy.CookerProxy(cooker2);
        cook.washFood();
        cook.cutFood();
        cook.stirFood();

        System.out.println("==============Cooker指定的代理来做菜================");
        proxy.forceproxy.Cooker cooker3 = new proxy.forceproxy.Cooker();
        proxy.forceproxy.ICook specifyProxy = cooker3.getProxy();
        specifyProxy.washFood();
        specifyProxy.cutFood();
        specifyProxy.stirFood();
    }

    @Test
    public void testPayProxy() {
        System.out.println("==============Cooker指定的代理来做菜================");
        proxy.forceproxy.Cooker cooker3 = new proxy.forceproxy.Cooker();
        proxy.forceproxy.ICook specifyProxy = cooker3.getProxy();
        specifyProxy.washFood();
        specifyProxy.cutFood();
        specifyProxy.stirFood();
    }

    @Test
    public void dynamicProxy(){
        proxy.dynamicproxy.ICook cook = new proxy.dynamicproxy.Cooker();

        ClassLoader classLoader = cook.getClass().getClassLoader();
        Class<?>[] interfaces = cook.getClass().getInterfaces();
        CookerHandler handler = new CookerHandler(cook);

        proxy.dynamicproxy.ICook proxyInstance = (proxy.dynamicproxy.ICook) Proxy.newProxyInstance(classLoader, interfaces, handler);
        proxyInstance.washFood();
        proxyInstance.cutFood();
        proxyInstance.stirFood();
    }

    @Test
    public void dynamicProxy2(){
        proxy.dynamicproxy.ICook cooker = new proxy.dynamicproxy.Cooker();
        proxy.dynamicproxy.ICook cookDynamicProxy = CookerDynamicProxy.newProxyInstance(cooker);
        cookDynamicProxy.cutFood();
        cookDynamicProxy.washFood();
        cookDynamicProxy.stirFood();
    }
}
