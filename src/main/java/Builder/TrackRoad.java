package Builder;

/**
 * Created by mr.yang on 2018/10/5.
 */
public class TrackRoad extends Road {
    //坡度
    @Override
    protected void slope() {
        System.out.println("建造上下坡……");
    }

    //弯道
    @Override
    protected void curve() {
        System.out.println("建造曲线车道……");
    }

    //桥梁
    @Override
    protected void bridge() {
        System.out.println("建造桥梁……");
    }

    //路标
    @Override
    protected void guide() {
        System.out.println("放置公路路标……");
    }

    //汽车
    @Override
    protected void car() {
        System.out.println("建造汽车……");
    }

    //立交
    @Override
    protected void interchange() {
        System.out.println("建造立交……");
    }
}
