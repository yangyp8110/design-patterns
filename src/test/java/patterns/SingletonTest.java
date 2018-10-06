package patterns;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.junit.Test;
import singleton.EnumSingleton;
import singleton.HungrySingleton;
import singleton.LazySingleton;
import singleton.Singleton2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

/**
 * Created by mr.yang on 2018/9/14.
 */
public class SingletonTest {
    @Test
    public void testHolder() {
        System.out.println("******************* singleton test *******************");

        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println("===================================");

        Singleton2 singleton = Singleton2.getSingleton();
        singleton.setName("holder");
        singleton.desc();
    }

    @Test
    public void testSingleton() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**饿汉模式——反射创建对象*/
        Class<HungrySingleton> singletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> singletonConstructor = singletonClass.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        /**先反射创建*/
        HungrySingleton hungrySingleton = singletonConstructor.newInstance();
        /**再通过单例模式获取实例*/
        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println(hungrySingleton);
        System.out.println(instance);

        System.out.println("=================================================================");

        /**懒汉模式——反射创建对象*/
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> lazySingletonConstructor = lazySingletonClass.getDeclaredConstructor();
        lazySingletonConstructor.setAccessible(true);
        /**先通过反射获取实例*/
        LazySingleton lazySingleton = lazySingletonConstructor.newInstance();
        /**再通过单例模式获取实例*/
        LazySingleton lazyInstance = LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazyInstance);
    }

    @Test
    public void testSerializer() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HungrySingleton instance = HungrySingleton.getInstance();
        String jsonString = JSON.toJSONString(instance);
        HungrySingleton singleton = JSON.parseObject(jsonString, HungrySingleton.class);
        System.out.println(instance);
        System.out.println(singleton);

    }

    @Test
    public void testEnumSingleton() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**枚举获取实例*/
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.setName("this is a enum singleton");
        instance.setAge(28);
        System.out.println("instance.name:"+instance.getName()+", instance.age:"+instance.getAge());

        /**序列化*/
        String jsonString = JSON.toJSONString(instance);
        /**反序列化创建对象*/
        EnumSingleton serializerInstance = JSON.parseObject(jsonString, EnumSingleton.class);
        System.out.println(instance == serializerInstance);

        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
        Constructor<EnumSingleton> enumSingletonConstructor = enumSingletonClass.getDeclaredConstructor();
        enumSingletonConstructor.setAccessible(true);
        /**反射创建*/
        EnumSingleton enumSingleton = enumSingletonConstructor.newInstance();
        System.out.println(enumSingleton);

        Suppliers.memoizeWithExpiration(() -> new Object(), 1, TimeUnit.MINUTES);
        Suppliers.memoize(() -> new Object());
        Supplier<Object> memoize = Suppliers.memoize(Object::new);
        Object o = memoize.get();
    }

    @Test
    public void testSuppliers() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Suppliers.memoizeWithExpiration(() -> new Object(), 1, TimeUnit.MINUTES);
        Suppliers.memoize(() -> new Object());
        Supplier<Object> memoize = Suppliers.memoize(Object::new);
        Object o = memoize.get();


        Supplier<Object> objSingle1 = Suppliers.memoize(Object::new);
        Supplier<Object> objSingle2 = Suppliers.memoize(Object::new);
        Object o1 = objSingle1.get();
        Object o2 = objSingle1.get();
        Object o3 = objSingle2.get();
        Object o4 = objSingle2.get();
    }
}
