package ru.folder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.folder.forms.UserForm;
import ru.folder.services.SignUpService;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService service;

    @GetMapping
    public String getSignUpPage(){
        return "/signUp";
    }
    @PostMapping("/signUp")
    public String signUp(UserForm userForm){
        service.signUp(userForm);
        return "redirect:/login";
    }
}
