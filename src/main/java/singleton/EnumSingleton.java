package singleton;

/**
 * Created by mr.yang on 2018/9/15.
 */
public enum EnumSingleton {
    INSTANCE;

    public String getDesc() {
        return "desc";
    }

    public static void process() {
        System.out.println("static process method");
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
