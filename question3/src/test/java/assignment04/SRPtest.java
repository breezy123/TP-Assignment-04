package assignment04;

/**
 * Created by aubrey on 31/03/2017.
 */
import assignment04.SRP.SrpBad.PersonSrpBad;
import assignment04.SRP.SrpGood.EmailSrpGood;
import assignment04.SRP.SrpGood.PersonSrpGood;
import assignment04.SRP.SrpGood.PrintSrpGood;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class SRPtest extends TestCase{

    public void testSrpBad(){
        PersonSrpBad badSrpTest = new PersonSrpBad("aubrey", 27, "aufredericks@gmail.com");
        Assert.assertNotNull(badSrpTest.getEmail());
        System.out.println(badSrpTest.toString());
    }

    public void testGoodSrp(){
        EmailSrpGood personEmail = new EmailSrpGood("aufredericks@gmail.com");
        PersonSrpGood person = new PersonSrpGood("aubrey", 27, personEmail);
        Assert.assertNotNull(person.getEmail());
        PrintSrpGood printPerson = new PrintSrpGood(person);
        printPerson.print();
    }
}
