package proxy.dynamicproxy;

/**
 * Created by mr.yang on 2018/10/13.
 */
public class CookerDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(T t){
        return (T)newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new CookerHandler(t));
    }
}
