package singleton;

/**
 * Created by mr.yang on 2018/9/13.
 */

import java.io.ObjectStreamException;

/**饿汉模式
 * 饿汉式中的单例对象instance是在对类Singleton初始化中创建的，在多线程环境下也是安全的。
 * 因为jvm在对类Singleton初始化时就考虑了多线程并发带来的问题。
 * */
public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    //限制外部产生HungrySingleton对象
    private HungrySingleton() {
        if (singleton != null) {
            throw new RuntimeException("不允许创建对象！");
        }
        System.out.println("singleton private construct method called");
    }

    //向外提供获取示例的静态方法
    public static HungrySingleton getInstance() {
        System.out.println("create singleton instance");
        return singleton;
    }

    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }
}