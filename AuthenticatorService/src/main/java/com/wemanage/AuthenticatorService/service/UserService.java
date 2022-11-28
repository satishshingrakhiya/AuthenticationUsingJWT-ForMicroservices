package com.wemanage.AuthenticatorService.service;

import com.wemanage.AuthenticatorService.exception.UserNotFoundException;
import com.wemanage.AuthenticatorService.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);
    public User getUserByNameAndPassword(String username, String password) throws UserNotFoundException;
}
