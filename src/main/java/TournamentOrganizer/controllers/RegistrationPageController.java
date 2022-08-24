package TournamentOrganizer.controllers;

import TournamentOrganizer.models.Registration;
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
    public String processUserRegistration(@ModelAttribute @Valid Registration newRegister,
                                          Errors errors, Model model, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword) {


        Registration register = new Registration(username,emailAddress,password,verifyPassword);

        if(!register.getPassword().equals(register.getVerifyPassword())) {
            model.addAttribute("PasswordMatchError", "Passwords do not match");
        }

                registrationPageRepository.save(register);
        return "redirect:/login";

        //make an error for when a user has already signed up; rerout to sign in page
        //do we have to make functionality for if a user has logged in already or if a user has lost their password
        //how will you let the computer know to change the sign in screen to main page?
    }
}
//    @PostMapping("registrationPage")
//    public String processUserRegistration(Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword, Registration newRegister) {
//
//        Registration register = new Registration(username,emailAddress,password,verifyPassword);
//
//
//        if (errors.hasErrors()) {
//            return "registrationPage";
//        }
//
//        //create a message or use if errors
//        if (!register.getPassword().equals(register.getVerifyPassword())) { //check the logic here
//            model.addAttribute("PasswordMatchError", "Passwords do not match");
////            return "registrationPage";
////        }
////
//
//        model.addAttribute("title", "Register");
//            model.addAttribute(new Registration());
//            registrationPageRepository.save(register); //should it be newRegister or register?

//        return "redirect:/login";  //technically it needs to go back to the main page, but Ian's got the code on this one.

        //I want the registered page to show after someone has signed up, then I want them re-routed to the main page with a login status as true, giving them access to create, edit, delete








