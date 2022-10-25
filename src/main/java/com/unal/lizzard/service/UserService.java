package com.unal.lizzard.service;

import com.unal.lizzard.model.User;
import com.unal.lizzard.web.dto.UserRegistrationDto;

public interface UserService {
    User save (UserRegistrationDto registrationDto);
}
