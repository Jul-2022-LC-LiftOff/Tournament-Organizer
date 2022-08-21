package TournamentOrganizer;

import TournamentOrganizer.models.AbstractEntity;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//add abstract class
//add one or more of the items below

@Entity//what's the mapped superclass then?
public class Signup extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 15, message = "username must be between 3 and 15 characters")
    private String username;


    @Email
    @NotBlank
    private String emailAddress;

    @Size(min = 4, max = 15, message = "password must be between 3 and 15 characters")
    @NotBlank
    private String password;

    @NotBlank
    private String verifyPassword; //password should equal verify password

    //this constructor isn't being used...
    //constructor
    public Signup(String username, String emailAddress, String password, String verifyPassword) {

        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    //no arg constructor

    public Signup() {
    }

         //getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    //do I need an override?

//    @Override
//    public String toString() {
//        return "Signup{" +
//                "username='" + username + '\'' +
//                '}';
//    }
}
