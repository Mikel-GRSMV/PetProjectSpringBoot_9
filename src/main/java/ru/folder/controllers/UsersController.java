package ru.folder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.folder.repositories.UserRepository;

@Controller
public class UsersController {
//    @Value("${my.property}") //добавляет запись в консоли!
//    private String myProperty;

    private UserRepository userRepository;
    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getUsersPage(ModelMap modelMap){
 //       System.out.println(myProperty); //добавляет запись в консоли!
        modelMap.addAttribute("usersFromServer", userRepository.findAll());
        return "users";

    }
}
