package ru.folder.services;

import org.springframework.stereotype.Service;
import ru.folder.forms.UserForm;

public interface SignUpService {
    void signUp(UserForm userForm);
}
