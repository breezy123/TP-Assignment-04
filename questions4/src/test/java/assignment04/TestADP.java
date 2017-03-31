package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.acceptsADP.BankAccountHolder.AccountHolder;
import assignment04.acceptsADP.Bank.BankOperations;
import assignment04.acceptsADP.Users.User;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class TestADP extends TestCase{

    public void testAcceptanceADP(){
        System.out.println("*****Accepts ADP*****");
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.depositFunds(new User(), "aubrey", 4500);
        BankOperations bankOperations = new BankOperations(new User());
        bankOperations.doUserActions();
    }

    public void testVioletsADP(){
        System.out.println("*****Violates ADP*****");
        User user = new User();
        user.depositFunds("aubrey", 950.90);
        user.getBalance("060789");
    }
}
