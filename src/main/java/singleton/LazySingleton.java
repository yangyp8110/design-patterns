package singleton;

/**
 * Created by mr.yang on 2018/9/14.
 */
/**懒汉模式*/
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) { //不用每次获取对象都强制加锁，提升了效率
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
