package assignment04.Service.Implementation;

/**
 * Created by aubrey on 31/03/2017.
 */
import  assignment04.domain.Vehicle;
import  assignment04.domain.Motorbike;
import  assignment04.Service.MonthlyPayment;

public class MotobikeImplement extends Vehicle implements  MonthlyPayment{

    public Vehicle getMonthlyPayment(){
        Vehicle moto = new Motorbike("Honda Bike","CA 98765",2400.00);
        return moto;
    }
}
