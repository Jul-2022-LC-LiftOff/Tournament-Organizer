package TournamentOrganizer;

public class SignupPage {
    private String username;
    private String emailAddress;
    private String password;
    private String verifyPassword; //password should equal verify password


    //constructor

    public SignupPage(String username, String emailAddress, String password, String verifyPassword){
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
                this.verifyPassword = verifyPassword;
        }
}
//put annotations with constraints on the names and passwords
