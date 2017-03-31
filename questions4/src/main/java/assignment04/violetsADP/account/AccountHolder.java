package assignment04.violetsADP.account;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.violetsADP.Users.User;

public class AccountHolder {

    private User user;

    public void depositFunds(String accountHolderName, double depositAmount)
    {
        user = new User();
        if(user.exists(accountHolderName))
        {
            System.out.println("You deposited R" + depositAmount + " into " + accountHolderName + " account");
        }
    }

    public double getBalance(String accountNumber)
    {
        System.out.println("balance is ...");
        return 0;
    }
}
