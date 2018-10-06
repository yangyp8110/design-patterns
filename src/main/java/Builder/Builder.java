package Builder;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by mr.yang on 2018/10/5.
 */
public abstract class Builder {
    /**
     * 不同部件的创建
     */
    public abstract void setPart(List<String> methods);

    /**
     * 建造轨道
     */
    public abstract TrackRoad buildRoad() throws InvocationTargetException, IllegalAccessException;
}
