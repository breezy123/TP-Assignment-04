package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.ISP.ispbad.HpPrintersIspbad;
import assignment04.ISP.ispbad.XeroxPrintersIspbad;
import assignment04.ISP.ispgood.HpPrintersIspgood;
import assignment04.ISP.ispgood.XeroxPrintersIspgood;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class ISPtest extends TestCase{

    public void testBadIsp(){
        System.out.println("*****Fat/Polluted Interface*****");
        XeroxPrintersIspbad printerMainOffice = new XeroxPrintersIspbad();
        printerMainOffice.print();
        printerMainOffice.copy();
        printerMainOffice.scan();
        printerMainOffice.staple();

        HpPrintersIspbad printerCoffeeRoom = new HpPrintersIspbad();
        printerCoffeeRoom.print();
        printerCoffeeRoom.copy();
        printerCoffeeRoom.scan();
        printerCoffeeRoom.staple();
    }
    public void testGoodIsp(){
        System.out.println("******Multiple interfaces******");
        XeroxPrintersIspgood printerMain = new XeroxPrintersIspgood();
        printerMain.print();
        printerMain.copy();
        printerMain.scan();
        printerMain.staple();

        HpPrintersIspgood printerLunchRoom = new HpPrintersIspgood();
        printerLunchRoom.print();
        printerLunchRoom.copy();
    }
}
