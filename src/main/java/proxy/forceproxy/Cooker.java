package proxy.forceproxy;

/**
 * Created by mr.yang on 2018/10/7.
 */
public class Cooker implements ICook {
    private ICook cook;

    @Override
    public void washFood() {
        if (this.isProxy()) {
            System.out.println("妈妈在洗菜……");
        } else {
            System.out.println("请妈妈指定的人来炒菜……");
        }
    }

    @Override
    public void cutFood() {
        if (this.isProxy()) {
            System.out.println("妈妈在切菜……");
        } else {
            System.out.println("请妈妈指定的人来炒菜……");
        }
    }

    @Override
    public void stirFood() {
        if (this.isProxy()) {
            System.out.println("妈妈在炒菜……");
        } else {
            System.out.println("请妈妈指定的人来炒菜……");
        }
    }

    @Override
    public ICook getProxy() {
        this.cook = new CookerProxy(this);
        return this.cook;
    }

    private Boolean isProxy() {
        if (this.cook == null) {
            return false;
        }
        return true;
    }
}
