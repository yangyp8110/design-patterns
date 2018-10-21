package mediator;

/**
 * Created by mr.yang on 2018/10/18.
 * 抽象中介者
 */
public abstract class Mediator {
    protected MrZhaoLessor mrZhaoLessor;
    protected MrQianLessor mrQianLessor;
    protected MrSunLessor mrSunLessor;

    public Mediator(){
        this.mrZhaoLessor = new MrZhaoLessor(this);
        this.mrQianLessor = new MrQianLessor(this);
        this.mrSunLessor = new MrSunLessor(this);
    }
    public MrZhaoLessor getMrZhaoLessor() {
        return mrZhaoLessor;
    }
    public void setMrZhaoLessor(MrZhaoLessor mrZhaoLessor) {
        this.mrZhaoLessor = mrZhaoLessor;
    }

    public MrQianLessor getMrQianLessor() {
        return mrQianLessor;
    }
    public void setMrQianLessor(MrQianLessor mrQianLessor) {
        this.mrQianLessor = mrQianLessor;
    }

    public MrSunLessor getMrSunLessor() {
        return mrSunLessor;
    }
    public void setMrSunLessor(MrSunLessor mrSunLessor) {
        this.mrSunLessor = mrSunLessor;
    }

    public abstract String getZhaoAndQianInfo();
    public abstract String getZhaoAndSunInfo();
    public abstract String getQianAndSunInfo();

    public abstract String getAllRoomInfo();
    public abstract String getAllRoomPrice();
}
