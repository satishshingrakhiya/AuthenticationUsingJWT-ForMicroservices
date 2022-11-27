package com.satish.AuthenticatorService.service;

import com.satish.AuthenticatorService.exception.UserNotFoundException;
import com.satish.AuthenticatorService.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);
    public User getUserByNameAndPassword(String username, String password) throws UserNotFoundException;
}
