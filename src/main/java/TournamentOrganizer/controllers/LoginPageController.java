package TournamentOrganizer.controllers;

import TournamentOrganizer.data.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginPageController {

    @Autowired
    private LoginRepository loginRepository;


    @GetMapping("login")
    public String loginPage() {
        return "login";
    }


}
