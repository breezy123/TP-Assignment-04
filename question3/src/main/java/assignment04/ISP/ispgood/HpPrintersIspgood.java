package assignment04.ISP.ispgood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class HpPrintersIspgood implements PrintServiceIspGood, CopyServiceIspGood{

    public void copy() {
        System.out.println("Copying job...");
    }

    public void print() {
        System.out.println("Printing job...");
    }
}
