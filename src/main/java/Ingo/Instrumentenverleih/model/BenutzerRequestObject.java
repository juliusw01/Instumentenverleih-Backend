package Ingo.Instrumentenverleih.model;

public class BenutzerRequestObject {

    public String name;
    public String firstName;
    public String email;
    public String password;

    public BenutzerRequestObject(String userName, String name, String firstName, String email, String password) {
        super();
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

}
