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

        public String userRegisters(@ModelAttribute  @Valid Model model, Errors errors, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword) {

        //verify that both passwords are the same
                if(errors.hasErrors()) {
                model.addAttribute("");//not sure if this needs to be there
                }

        return "registered";

    }
        }
//create objects that let users add their name, and a password






