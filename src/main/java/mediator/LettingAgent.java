package mediator;

/**
 * Created by mr.yang on 2018/10/18.
 * 房屋中介
 */
public class LettingAgent extends Mediator {
    @Override
    public String getAllRoomInfo() {
        String roomInfo = "我手里有这几种房型：\n"
                + super.getMrZhaoLessor().roomInfo() + "\n"
                + super.getMrQianLessor().roomInfo() + "\n"
                + super.getMrSunLessor().roomInfo();
        return roomInfo;
    }

    @Override
    public String getAllRoomPrice() {
        String roomPrice = super.getMrZhaoLessor().roomInfo() + ",价格：" + super.getMrZhaoLessor().roomPrice() + "\n"
                + super.getMrQianLessor().roomInfo() + ",价格：" + super.getMrQianLessor().roomPrice() + "\n"
                + super.getMrSunLessor().roomInfo() + ",价格：" + super.getMrSunLessor().roomPrice();
        return roomPrice;
    }

    @Override
    public String getZhaoAndQianInfo(){
        String otherRoom = super.getMrZhaoLessor().roomInfo() + ",价格：" + super.getMrZhaoLessor().roomPrice() + "\n"
                + super.getMrQianLessor().roomInfo() + ",价格：" + super.getMrQianLessor().roomPrice();
        return otherRoom;
    }

    @Override
    public String getZhaoAndSunInfo(){
        String otherRoom = super.getMrZhaoLessor().roomInfo() + ",价格：" + super.getMrZhaoLessor().roomPrice() + "\n"
                + super.getMrSunLessor().roomInfo() + ",价格：" + super.getMrSunLessor().roomPrice();
        return otherRoom;
    }

    @Override
    public String getQianAndSunInfo(){
        String otherRoom = super.getMrQianLessor().roomInfo() + ",价格：" + super.getMrQianLessor().roomPrice() + "\n"
                + super.getMrSunLessor().roomInfo() + ",价格：" + super.getMrSunLessor().roomPrice();
        return otherRoom;
    }
}
