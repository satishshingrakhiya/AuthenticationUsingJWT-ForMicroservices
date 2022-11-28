package com.wemanage.AuthenticatorService.config;

import com.wemanage.AuthenticatorService.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {
    Map<String, String> generateToken(User user);
}
