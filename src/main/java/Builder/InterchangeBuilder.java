package Builder;

import java.util.List;

/**
 * Created by mr.yang on 2018/10/5.
 */
public class InterchangeBuilder extends Builder {
    private TrackRoad road = new TrackRoad();
    @Override
    public void setPart(List<String> methods) {
        this.road.setList(methods);
    }

    @Override
    public TrackRoad buildRoad() {
        return this.road;
    }
}
