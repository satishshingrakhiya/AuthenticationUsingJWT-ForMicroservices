package com.wemanage.AuthenticatorService.service;

import com.wemanage.AuthenticatorService.exception.UserNotFoundException;
import com.wemanage.AuthenticatorService.model.User;
import com.wemanage.AuthenticatorService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByNameAndPassword(String username, String password) throws UserNotFoundException {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user == null){
            throw new UserNotFoundException("Invalid username and password");
        }
        return user;
    }
}
