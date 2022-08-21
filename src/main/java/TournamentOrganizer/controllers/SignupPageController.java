package TournamentOrganizer.controllers;

import TournamentOrganizer.Signup;
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


    //display signup page

    @GetMapping("signupPage")
    public String displaySignupPage(Model model) {
        model.addAttribute("title", "Signup");
        model.addAttribute(new Signup()); //connects to signup details--
        return "signupPage";
    }


    //do I need a create registration form and a process registration form?//

    @PostMapping("signupPage")
    public String processUserRegistration(@ModelAttribute @Valid Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword, Signup newSignup ) {

        //conditional needed to check to see if password and verifyPassword is the same
        //it doesn't have anything it's doing
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Signup");
            model.addAttribute(new Signup());
        }

            return "signupPage";
        }


}


/*My logic:
1. when a user signs up, they are rerouted to a page that says thanks for registering?  or to the homepage?
2. I need a method that will take the users info and process it--check if the two passwords are valid and log the user in--is that one or two methods?


3. I'm struggling to remember what Model model creates.  a model, b
4. what mapped superclass should I have--do I need an abstract entity?
* */





