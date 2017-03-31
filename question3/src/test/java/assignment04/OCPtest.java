package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.OCP.ocpBad.CalculateAreaOcpBad;
import assignment04.OCP.ocpBad.CircleOcpBad;
import assignment04.OCP.ocpBad.RectangleOcpBad;
import assignment04.OCP.ocpGood.CalculateAreaOcpGood;
import assignment04.OCP.ocpGood.CircleOcpGood;
import assignment04.OCP.ocpGood.RectangleOcpGood;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class OCPtest extends TestCase{

    public void testOcpBad(){
        RectangleOcpBad rectangle = new RectangleOcpBad(4, 6);
        CircleOcpBad circle = new CircleOcpBad(3);
        CalculateAreaOcpBad calcAreaOcpBad = new CalculateAreaOcpBad();
        System.out.println(calcAreaOcpBad.area(rectangle));
        System.out.println(calcAreaOcpBad.area(circle));
        Assert.assertEquals(calcAreaOcpBad.area(rectangle), 24.0);
    }

    public void testOcpGood(){
        RectangleOcpGood rectangle = new RectangleOcpGood(5, 10);
        CircleOcpGood circle = new CircleOcpGood(6);
        CalculateAreaOcpGood calcAreaOcpGood = new CalculateAreaOcpGood();
        System.out.println(calcAreaOcpGood.area(rectangle));
        System.out.println(calcAreaOcpGood.area(circle));
        Assert.assertEquals(calcAreaOcpGood.area(rectangle), 50.0);
    }
}
