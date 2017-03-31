package assignment04.acceptsADP.Bank;

/**
 * Created by aubrey on 31/03/2017.
 */
public class BankOperations {
    private BankService bankService;

    public BankOperations(BankService bankService)
    {
        this.bankService = bankService;
    }

    public void doUserActions()
    {
        bankService.getUserBalance("1234");
    }
}
