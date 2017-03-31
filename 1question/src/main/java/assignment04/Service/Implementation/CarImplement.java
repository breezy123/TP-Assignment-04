package assignment04.Service.Implementation;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.domain.Car;
import assignment04.domain.Vehicle;
import assignment04.Service.MonthlyPayment;

public class CarImplement extends Vehicle implements MonthlyPayment {

    public Vehicle getMonthlyPayment() {

        Vehicle machine = new Car("BMW", "CA 12345", 3500.00);
        return machine;
    }
}
