package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by mr.yang on 2018/10/13.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler){
        return (T)Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
