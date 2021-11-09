package ru.folder.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.folder.security.details.UserDetailsImpl;
import ru.folder.transfer.UserDto;

@Controller
public class ProfileController {
    @GetMapping("/")
    public String getProfilePage(ModelMap model, Authentication authentication){
        if (authentication == null){
            return "redirect:/login";
        }
      UserDetailsImpl details = (UserDetailsImpl)authentication.getPrincipal();
        UserDto userDto = UserDto.from(details.getUser());
        model.addAttribute("user", userDto);
        return "profile";
    }
}
