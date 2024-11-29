package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import anar.anar.src.main.java.az.bizimkler.anar.service.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        if (userService.userExists(username)) {
            model.addAttribute("message", "bu hesab artiq movcuddur");
            return "register";
        }
        userService.createUser(username, password);
        return "redirect:/login";
    }
}
