package org.example;


import org.example.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {

    Map<String, String> generateToken(User user);
}
