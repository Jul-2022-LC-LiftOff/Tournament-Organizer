package TournamentOrganizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginPageController {

    @GetMapping("/login")
    @ResponseBody
    public String loginPage(Model model) {
        return "I know that you work now!";
    }

//    @GetMapping("/login") //this obviously needs flushing out
//    public String username(Model model) {
//        return "username";
//
//    }

}
