package templatemethod;

/**
 * Created by mr.yang on 2018/10/5.
 */
public class LaoWangLearn extends Learn {
    @Override
    public void goPrimarySchool() {
        System.out.println("6 years primary school");
    }

    @Override
    public void goMiddleSchool() {
        System.out.println("3 years middle school");
    }

    @Override
    public void goHignSchool() {
        System.out.println("3 years high school");
    }

    @Override
    public void goUniversity() {
        System.out.println("4 years university school");
    }

    @Override
    protected Boolean isNeedHighSchool() {
        return false;
    }
}
