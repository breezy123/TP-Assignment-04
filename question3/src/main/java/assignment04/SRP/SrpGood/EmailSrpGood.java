package assignment04.SRP.SrpGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class EmailSrpGood {
    private String email;

    public EmailSrpGood(String email)
    {
        String simple = "^(.+)@(.+)$";

        if(email.matches(simple))
        {
            this.email = email;
        }
        else
        {
            System.out.println("Wrong email");

        }
    }

    public String getEmailAddress()
    {
        return email;
    }
}
