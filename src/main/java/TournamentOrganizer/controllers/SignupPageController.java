package TournamentOrganizer.controllers;

import TournamentOrganizer.Signup;
import TournamentOrganizer.data.SignupRepository;
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
SignupRepository signupRepository;



    //display signup page

    @GetMapping("signupPage")
    public String displaySignupPage(Model model) {
        model.addAttribute("title", "Signup"); //do I need this?
        model.addAttribute(new Signup()); //connects to signup details--right? Do I need this?
        return "signupPage";
    }


    @PostMapping("signupPage")
    public String processUserRegistration(@ModelAttribute @Valid Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword, Signup newSignup) {

        Signup signup = new Signup(username,emailAddress,password,verifyPassword);
        signupRepository.save(signup);

        if (errors.hasErrors()){
            model.addAttribute("title", "Create Signup");
            model.addAttribute(new Signup());
        }

        return "redirect:"; //I want the registered page to show after someone has signed up, then I want them re-routed to the main page with a login status as true, giving them access to create, edit, delete
        }


}




