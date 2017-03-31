package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.Service.Implementation.CarImplement;
import assignment04.Service.Implementation.MotobikeImplement;
import assignment04.config.AppConfig;
import assignment04.domain.Motorbike;
import assignment04.domain.Vehicle;
import assignment04.Service.MonthlyPayment;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMonthlyPayment extends TestCase {

    //private MonthlyPayment payment;
    private Vehicle vehicles ;
    private CarImplement car = new CarImplement();
    private MotobikeImplement motor = new MotobikeImplement();

    public void testCarPayment(){

        //Vehicle vehicle = payment.getMonthlyPayment();
        System.out.println(car.getMonthlyPayment().toString());
        Assert.assertEquals(vehicles.getInstallment(), 3500.00);
    }
    public void testMotobikePayment(){
        System.out.println(motor.getMonthlyPayment().toString());
        Assert.assertEquals(vehicles.getInstallment(), 2400.00);
    }
}
