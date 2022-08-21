package TournamentOrganizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginPageController {




    @GetMapping("login")
    public String loginPage() {
        return "login";
    }


}
