package TournamentOrganizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SignupPageController {

    @GetMapping("signup")
        public String signupPage() {
            return "signupPage";
        }


    @PostMapping("registered")

        public String userRegisters(Model model, @RequestParam String username, @RequestParam String emailAddress, @RequestParam String password, @RequestParam String verifyPassword) {
        //verify that both passwords are the same


        return "registered";

    }
        }
//create objects that let users add their name, and a password






