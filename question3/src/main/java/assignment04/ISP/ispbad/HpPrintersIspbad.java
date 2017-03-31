package assignment04.ISP.ispbad;

/**
 * Created by aubrey on 31/03/2017.
 */
public class HpPrintersIspbad implements MachineServiceIspbad {

    public void print() {
        System.out.println("Printing job...");
    }

    public void copy() {
        System.out.println("Copying job...");
    }

    public void scan() {
        System.out.println("Cannot scan...");
    }

    public void staple() {
        System.out.println("Cannot staple...");
    }
}
