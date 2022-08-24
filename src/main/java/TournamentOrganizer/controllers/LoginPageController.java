package TournamentOrganizer.controllers;

import TournamentOrganizer.data.LoginPageRepository;
import TournamentOrganizer.models.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class LoginPageController {

LoginPageRepository loginPageRepository;


    @GetMapping("login")
    public String loginPage() {
        return "login";
    }


    @PostMapping("login")
    public String processLoginForm(@ModelAttribute @Valid Login newLogin, Errors errors, Model model, @RequestParam String userLogin, @RequestParam String userPassword){


        Login login = new Login(userLogin, userPassword);

        loginPageRepository.save(login);

        return "login";
    }
}
