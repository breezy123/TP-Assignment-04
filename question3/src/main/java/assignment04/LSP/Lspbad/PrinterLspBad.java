package assignment04.LSP.Lspbad;

/**
 * Created by aubrey on 31/03/2017.
 */
import java.rmi.UnexpectedException;
public class PrinterLspBad {

    public void print(int baseX)
    {
        System.out.println("printing in non colour...");
    }
    public void print(int baseX, int baseY, int baseZ)
    {
        throw new UnsupportedOperationException();
    }
}
