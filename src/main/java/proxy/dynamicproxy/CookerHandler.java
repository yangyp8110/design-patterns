package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mr.yang on 2018/10/7.
 */
public class CookerHandler implements InvocationHandler {
    Class clazz = null;

    Object obj = null;

    public CookerHandler(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
