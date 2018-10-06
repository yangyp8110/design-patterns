package patterns;

import org.junit.Test;
import templatemethod.LaoWangLearn;
import templatemethod.XiaoMingLearn;

/**
 * Created by mr.yang on 2018/10/5.
 */
public class TemplateMethodRest {
    @Test
    public void testXiaoMing() {
        XiaoMingLearn xiaoMingLearn = new XiaoMingLearn();
        xiaoMingLearn.learnExp();
    }
    @Test
    public void testLaoWang() {
        LaoWangLearn laoWangLearn = new LaoWangLearn();
        laoWangLearn.learnExp();
    }
}
