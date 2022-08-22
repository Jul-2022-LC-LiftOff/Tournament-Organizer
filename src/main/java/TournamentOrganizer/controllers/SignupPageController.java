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
private SignupRepository signupRepository;



    //display signup page

    @GetMapping("signupPage")
    public String displaySignupPage() {
        //call the table name from the database?
        return "signupPage";
    }


    @PostMapping("signupPage")
    public String processUserRegistration(@ModelAttribute @Valid Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword, Signup newSignup) {

        Signup signup = new Signup(username,emailAddress,password,verifyPassword);
        signupRepository.save(signup);

        if (errors.hasErrors()) {
            return "signupPage";
        }
        //be sure to check the password--if user doesn't have correct password, in model attribute
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Signup");
            model.addAttribute(new Signup());

            if (!signup.getPassword().equals(signup.getVerifyPassword())) {
                model.addAttribute("PasswordMatchError", "Passwords do not match");
                return "signupPage";
            }
            //create a message or use if errors
        }
        return "redirect:/login"; //I want the registered page to show after someone has signed up, then I want them re-routed to the main page with a login status as true, giving them access to create, edit, delete
        }


}




