package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.LSP.Lspbad.*;
import assignment04.LSP.LspGood.*;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class LSPtest extends TestCase{

    public void testLspBad(){
        PrinterLspBad printLspBad = new PrinterLspBad();
        printLspBad.print(3);
        try {
            printLspBad.print(1, 2, 3);
        }catch(Exception e)
        {
            System.out.println("This printer cannot print in colour.");
        }
    }

    public void testLstGood(){
        ColourPrintLspGood printLspGood = new ColourPrintLspGood();
        NonColourPrintLspGood test = new NonColourPrintLspGood();
        test = printLspGood;  //<<----- to test Liskov
        printLspGood.print(1, 2, 3);
    }
}
