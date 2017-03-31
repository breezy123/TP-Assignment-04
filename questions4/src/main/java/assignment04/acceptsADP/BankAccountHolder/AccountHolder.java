package assignment04.acceptsADP.BankAccountHolder;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.acceptsADP.Bank.BankService;
public class AccountHolder {

    public void depositFunds(BankService bankService,String username, double depositAmount)
    {
        if(bankService.exists("jason"))
        {
            System.out.println("You deposited R" + depositAmount + " into " + username + " account");
        }
    }

    public double getBalance(String accountNumber)
    {
        System.out.println("Balance is ...");
        return 1.0;
    }
}
