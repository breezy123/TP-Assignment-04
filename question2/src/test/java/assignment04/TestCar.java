package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class TestCar extends TestCase{

    private Car car = new Car("Golf GTI",1994,1300,2.0,"Oil filled",true);

    public void test1Car(){

        System.out.println(car.toString());
        Assert.assertEquals(true,car.getShocks().isSprings());
    }
    public void test2Car(){
        car.getEngine().setCapacity(1250);
        System.out.println(car.toString());
        Assert.assertEquals(car.getEngine().getCapacity(), 1250);
    }
}
