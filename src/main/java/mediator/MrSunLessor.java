package mediator;

import java.math.BigDecimal;

/**
 * Created by mr.yang on 2018/10/18.
 * 孙包租(两室一厅一厨一卫)
 */
public class MrSunLessor extends AbstractLessor {
    private BigDecimal price;

    public MrSunLessor(Mediator mediator) {
        super(mediator);
    }

    public String roomInfo() {
        return "老孙的两室一厅一厨一卫";
    }

    public BigDecimal roomPrice() {
        return BigDecimal.valueOf(3600);
    }

    public String askRoomPrice() {
        return super.mediator.getZhaoAndQianInfo();
    }
}
