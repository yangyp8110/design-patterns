package mediator;

import java.math.BigDecimal;

/**
 * Created by mr.yang on 2018/10/18.
 * 钱包租(一室一厅一卫)
 */
public class MrQianLessor extends AbstractLessor {
    public MrQianLessor(Mediator mediator) {
        super(mediator);
    }

    public String roomInfo() {
        return "老钱的一室一厅一卫";
    }

    public BigDecimal roomPrice() {
        return BigDecimal.valueOf(2500);
    }

    public String askOtherRoomInfo() {
        return super.mediator.getZhaoAndSunInfo();
    }
}
