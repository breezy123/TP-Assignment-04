package assignment04.violetsADP.Users;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.violetsADP.account.AccountHolder;

public class User extends AccountHolder {

    public double getUserBalance(String accountNumber)
    {
        return getBalance(accountNumber);
    }

    public boolean exists(String accountHolderName)
    {
        return true;
    }
}
