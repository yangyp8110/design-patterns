package mediator;

import java.math.BigDecimal;

/**
 * Created by mr.yang on 2018/10/18.
 * 赵包租(一室一厨一卫)
 */
public class MrZhaoLessor extends AbstractLessor {
    public MrZhaoLessor(Mediator mediator) {
        super(mediator);
    }

    public String roomInfo() {
        return "老赵的一室一厨一卫";
    }

    public BigDecimal roomPrice() {
        BigDecimal roomWithKitchAndToiletPrice = super.mediator.getMrQianLessor().roomPrice();
        if (roomWithKitchAndToiletPrice == null) {
            //自己内心价格
            return BigDecimal.valueOf(2500);
        }
        return roomWithKitchAndToiletPrice.add(BigDecimal.valueOf(100));
    }

    public String talk() {
        return "很好租，独立厨房卫生间";
    }
}
