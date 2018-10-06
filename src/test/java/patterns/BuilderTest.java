package patterns;

import Builder.AnnularBuilder;
import Builder.Director;
import Builder.InterchangeBuilder;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mr.yang on 2018/10/5.
 */
public class BuilderTest {
    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("===========================建造立交车道===========================");
        InterchangeBuilder interchangeBuilder = new InterchangeBuilder();
        List<String> interMethods = new ArrayList<>();
        interMethods.add("slope");
        interMethods.add("bridge");
        interMethods.add("guide");
        interMethods.add("interchange");
        interMethods.add("car");
        interchangeBuilder.setPart(interMethods);
        interchangeBuilder.buildRoad().create();

        System.out.println("===========================建造曲线车道===========================");
        AnnularBuilder annularBuilder = new AnnularBuilder();
        List<String> annularMethods = new ArrayList<>();
        annularMethods.add("curve");
        annularMethods.add("bridge");
        annularMethods.add("guide");
        annularMethods.add("curve");
        annularMethods.add("car");
        annularBuilder.setPart(annularMethods);
        annularBuilder.buildRoad().create();
    }

    @Test
    public void testDerictor() throws InvocationTargetException, IllegalAccessException {
        Director director = new Director();
        director.getAnnularBuilder().create();

        director.getInterchangeBuilder().create();
    }
}
