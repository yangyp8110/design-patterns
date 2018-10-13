package proxy.commonproxy;

/**
 * Created by mr.yang on 2018/10/7.
 */
public class Cooker implements ICook {
    @Override
    public void washFood() {
        System.out.println("妈妈在洗菜……");
    }

    @Override
    public void cutFood() {
        System.out.println("妈妈在切菜……");
    }

    @Override
    public void stirFood() {
        System.out.println("妈妈在炒菜……");
    }
}
