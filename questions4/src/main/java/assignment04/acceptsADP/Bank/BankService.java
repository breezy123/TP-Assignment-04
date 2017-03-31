package assignment04.acceptsADP.Bank;

/**
 * Created by aubrey on 31/03/2017.
 */
public interface BankService {

    void depositFunds(BankService bankService, String username, double depositAmount);
    double getBalance(String accountNumber);
    double getUserBalance(String accountNumber);
    boolean exists(String username);
}
