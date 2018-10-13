package proxy.forceproxy;

/**
 * Created by mr.yang on 2018/10/7.
 */
public class CookerProxy implements ICook, IPay {
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
        this.pay();
    }

    @Override
    public void pay() {
        System.out.println("做完饭拿到了1元钱");
    }

    @Override
    public ICook getProxy() {
        /** 可以指定代理的代理，暂时没有就是自己 */
        return this;
    }
}
