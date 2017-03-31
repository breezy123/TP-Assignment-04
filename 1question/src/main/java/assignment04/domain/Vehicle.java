package assignment04.domain;

/**
 * Created by aubrey on 31/03/2017.
 */
import java.io.Serializable;
public abstract class Vehicle implements Serializable{
    private String vehicleType;
    private String regNumber;
    private double installment;

   public Vehicle(){}
   public Vehicle(String vehicleType,String regNumber,double installment){
        setCarName(vehicleType);
        setRegistrationNumber(regNumber);
        setPrice(installment);
    }

    public void setCarName(String vehicleType){

        this.vehicleType= vehicleType;
    }

    public void setRegistrationNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public void setPrice(double installment){
        this.installment = installment;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public String getRegistrationNo(){
        return regNumber;
    }

    public double getInstallment(){
        return installment;
    }

    @Override
    public String toString(){
        return "Vehicle Type: " + vehicleType + "\n" + "Registration Number: " + regNumber + "\n" + "Monthly Installment: " + installment + "\n";
    }
}
