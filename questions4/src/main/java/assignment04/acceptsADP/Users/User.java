package assignment04.acceptsADP.Users;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.acceptsADP.BankAccountHolder.AccountHolder;
import assignment04.acceptsADP.Bank.BankService;


public class User extends AccountHolder implements BankService{
    public double getUserBalance(String accountNumber) {
        return getBalance(accountNumber);
    }

    public boolean exists(String username) {
        return true;
    }

    public void depositFunds(String aubrey, double v) {
    }
}
