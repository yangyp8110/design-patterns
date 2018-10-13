package proxy.commonproxy;

/**
 * Created by mr.yang on 2018/10/7.
 */
public class CookerProxy implements ICook {
    private ICook cooker;

    public CookerProxy(ICook cooker){
        this.cooker = cooker;
    }

    @Override
    public void washFood() {
        this.cooker.washFood();
    }

    @Override
    public void cutFood() {
        this.cooker.cutFood();
    }

    @Override
    public void stirFood() {
        this.cooker.stirFood();
    }
}
