package singleton;

/**
 * Created by mr.yang on 2018/9/14.
 */
public class Singleton2 {
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class Singleton2Holder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton2 singleton = new Singleton2();
    }

    private Singleton2() {
        System.out.println("singleton2 private construct method called");
    }

    public static Singleton2 getSingleton() {
        System.out.println("singleton2 getSingleton method called");
        return Singleton2Holder.singleton;
    }

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void desc() {
        System.out.println("singleton2 desc method called");
    }
}
