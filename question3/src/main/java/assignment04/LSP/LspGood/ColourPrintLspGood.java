package assignment04.LSP.LspGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class ColourPrintLspGood extends NonColourPrintLspGood{
    public void print(int baseX, int baseY, int baseZ)
    {
        super.print(baseX);
        System.out.println("printing in colour...");
    }
}
