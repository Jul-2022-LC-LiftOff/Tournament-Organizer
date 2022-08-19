package TournamentOrganizer.controllers;

import TournamentOrganizer.data.SignupPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
public class SignupPageController {

    @Autowired
    private SignupPageRepository signupPageRepository;

    @GetMapping("signup")
    public String signupPage() {
        return "signupPage";
    }



    @PostMapping("registered")
    public String userRegisters(@ModelAttribute @Valid Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword) {
//addAttrubute adds the specific name of an attribute..

        //conditional needed to check to see if password and verifyPassword is the same
        return "registered";
    }
}


/*My logic:
1. when a user signs up, they are rerouted to a page that says thanks for registering?  or to the homepage?
2. I need a method that will take the users info and process it--check if the two passwords are valid and log the user in--is that one or two methods?


3. I'm struggling to remember what Model model creates.  a model, b
4. what mapped superclass should I have--do I need an abstract entity?
* */





