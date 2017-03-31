package assignment04.SRP.SrpGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class PersonSrpGood {

    private String name;
    private int age;
    private EmailSrpGood email;

    public PersonSrpGood(String name, int age, EmailSrpGood email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email.getEmailAddress();
    }

}
