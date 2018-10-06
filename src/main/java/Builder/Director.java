package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mr.yang on 2018/10/5.
 */
public class Director {
    private List<String> steps = new ArrayList<>();
    private InterchangeBuilder interchangeBuilder = new InterchangeBuilder();
    private AnnularBuilder annularBuilder = new AnnularBuilder();

    public TrackRoad getInterchangeBuilder(){
        System.out.println("===========================建造立交车道===========================");
        this.steps.clear();
        this.steps.add("slope");
        this.steps.add("bridge");
        this.steps.add("guide");
        this.steps.add("interchange");
        this.steps.add("car");
        this.interchangeBuilder.setPart(this.steps);
        return this.interchangeBuilder.buildRoad();
    }

    public TrackRoad getAnnularBuilder(){
        System.out.println("===========================建造曲线车道===========================");
        this.steps.add("curve");
        this.steps.add("bridge");
        this.steps.add("guide");
        this.steps.add("car");
        this.annularBuilder.setPart(this.steps);
        return this.annularBuilder.buildRoad();
    }
}
