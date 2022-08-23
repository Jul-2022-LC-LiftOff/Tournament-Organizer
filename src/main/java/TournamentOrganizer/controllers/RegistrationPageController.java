package TournamentOrganizer.controllers;

import TournamentOrganizer.Registration;
import TournamentOrganizer.data.RegistrationPageRepository;
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
public class RegistrationPageController {

@Autowired
private RegistrationPageRepository registrationPageRepository;



    //display signup page

    @GetMapping("registrationPage")
    public String displaySignupPage() {
        //call the table name from the database?
        return "registrationPage";
    }


    @PostMapping("registrationPage")
    public String processUserRegistration(@ModelAttribute @Valid Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword, Registration newRegister) {

        Registration register = new Registration(username,emailAddress,password,verifyPassword);

        if (errors.hasErrors()) {
            return "registrationPage";
        }


        //create a message or use if errors
        if (!register.getPassword().equals(register.getVerifyPassword())) { //check the logic here
            model.addAttribute("PasswordMatchError", "Passwords do not match");
            return "registrationPage";
        }


        model.addAttribute("title", "Register");
            model.addAttribute(new Registration());

            registrationPageRepository.save(newRegister); //should it be newRegister or register?

        return "redirect:/login"; //I want the registered page to show after someone has signed up, then I want them re-routed to the main page with a login status as true, giving them access to create, edit, delete

    }
        }





