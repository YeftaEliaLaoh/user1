package org.example.service;


import org.example.UserNotFoundException;
import org.example.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);
    public User getUserByNameAndPassword(String name, String password) throws UserNotFoundException;
}
