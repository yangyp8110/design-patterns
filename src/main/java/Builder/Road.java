package Builder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mr.yang on 2018/10/5.
 */
public abstract class Road {
    //坡度
    protected abstract void slope();
    //弯道
    protected abstract void curve();
    //桥梁
    protected abstract void bridge();
    //路标
    protected abstract void guide();
    //汽车
    protected abstract void car();
    //立交
    protected abstract void interchange();

    private List<String> list = new ArrayList<>();

    final public void create() throws InvocationTargetException, IllegalAccessException {
        Method[] methods = this.getClass().getDeclaredMethods();
        for (String method : list) {
            for (int i = 0; i < methods.length; i++) {
                if (methods[i].getName().equals(method)) {
                    methods[i].invoke(this, null);
                }
            }
        }
    }

    final public void setList(List<String> methods){
        this.list = methods;
    }
}
