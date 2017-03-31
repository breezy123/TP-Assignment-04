package assignment04.domain;

/**
 * Created by aubrey on 31/03/2017.
 */
public class Car extends Vehicle{
    public Car(){}

    public Car(String carName, String regNo, double installment){
        super(carName,regNo,installment);
    }

    //@Override
    public double payment(){
        return (super.getInstallment() * 0.14) + super.getInstallment();
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Sub Monthly Installment: R" + super.getInstallment() + "\n" + "VAT: 14%" + "\n" + "Total Payment: " + payment() + "\n";
    }

}
