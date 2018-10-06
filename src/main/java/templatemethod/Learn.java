package templatemethod;

/**
 * Created by mr.yang on 2018/10/5.
 */
public abstract class Learn {

    public abstract void goPrimarySchool();

    public abstract void goMiddleSchool();

    public abstract void goHignSchool();

    public abstract void goUniversity();

    final public void learnExp() {
        goPrimarySchool();

        goMiddleSchool();

        if(isNeedHighSchool()) {
            goHignSchool();
        }

        goUniversity();
    }

    protected Boolean isNeedHighSchool() {
        return true;
    }
}
