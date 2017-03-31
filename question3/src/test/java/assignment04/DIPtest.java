package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.DIP.dipBad.ManagerdipBad;
import assignment04.DIP.dipBad.WorkerdipBad;
import assignment04.DIP.dipGood.ManagerdipGood;
import assignment04.DIP.dipGood.SuperWorkerdipGood;
import assignment04.DIP.dipGood.WorkerdipGood;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class DIPtest extends TestCase{

    public void testDipBad(){

        WorkerdipBad worker = new WorkerdipBad();
        ManagerdipBad manager = new ManagerdipBad();
        manager.setWorker(worker);
        manager.manage();
    }

    public void testDipGood(){

        WorkerdipGood worker = new WorkerdipGood();
        SuperWorkerdipGood superWorker = new SuperWorkerdipGood();
        ManagerdipGood manager = new ManagerdipGood();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}
