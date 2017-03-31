package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.PLK.plkBad.PizzaPlkBad;
import assignment04.PLK.plkBad.ToppingsPlkBad;
import assignment04.PLK.plkGood.CustomerOrderplkGood;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class PLKtest extends TestCase{

    public void testBadPlk(){
        PizzaPlkBad pizza = new PizzaPlkBad();
        pizza.setSize("Large");
        pizza.setPrice(35);
        pizza.getTopping().setType("Ham");
        pizza.getTopping().setPrice(8);
        pizza.print();
    }

    public void testPlkGood(){
        CustomerOrderplkGood orderPizza = new CustomerOrderplkGood();
        orderPizza.orderPizza();
        orderPizza.print();
    }
}
