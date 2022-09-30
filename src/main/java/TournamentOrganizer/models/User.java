package TournamentOrganizer.models;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

    //fields
    private String username;
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    //constructors
    public User(){}

    //encodes the password using encoder
    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    //validates password and pwHash as the same
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }


    //getter
    public String getUsername() {
        return username;
    }
}
