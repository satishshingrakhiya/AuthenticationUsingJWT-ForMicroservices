package com.satish.AuthenticatorService.config;

import com.satish.AuthenticatorService.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {
    Map<String, String> generateToken(User user);
}
