package assignment04.ISP.ispgood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class XeroxPrintersIspgood implements PrintServiceIspGood, CopyServiceIspGood{
    public void print() {
        System.out.println("Printing job...");
    }

    public void copy() {
        System.out.println("Copying job...");
    }

    public void scan() {
        System.out.println("Scanning job...");
    }

    public void staple() {
        System.out.println("Stapeling job...");
    }
}
