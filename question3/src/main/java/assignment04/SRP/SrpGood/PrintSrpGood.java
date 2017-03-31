package assignment04.SRP.SrpGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class PrintSrpGood {

    PersonSrpGood person;

    public PrintSrpGood(PersonSrpGood person)
    {
        this.person = person;
    }

    public void print()
    {
        System.out.println("Person: " + person.getName() + ", " + person.getAge() + "\nEmail: " + person.getEmail());
    }
}
