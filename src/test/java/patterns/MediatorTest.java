package patterns;

import mediator.LettingAgent;
import mediator.MrQianLessor;
import mediator.MrSunLessor;
import mediator.MrZhaoLessor;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mr.yang on 2018/10/28.
 */
public class MediatorTest {
    @Test
    public void test() {
        LettingAgent agent = new LettingAgent();

        MrZhaoLessor zhaoLessor = new MrZhaoLessor(agent);
        BigDecimal zhaoPrice = zhaoLessor.roomPrice();
        String talk = zhaoLessor.talk();
        System.out.println(">>>赵先生：\n" + zhaoPrice + ",\n" + talk+"\n");

        MrQianLessor qianLessor = new MrQianLessor(agent);
        String qianRoom = qianLessor.askOtherRoomInfo();
        System.out.println(">>>钱先生：\n" + qianRoom+"\n");

        MrSunLessor sunLessor = new MrSunLessor(agent);
        String sunPrice = sunLessor.askRoomPrice();
        System.out.println(">>>孙先生：\n" + sunPrice+"\n");
    }
}
