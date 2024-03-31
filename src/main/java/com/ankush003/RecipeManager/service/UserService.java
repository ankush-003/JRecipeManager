package com.ankush003.RecipeManager.service;

import com.ankush003.RecipeManager.Model.User;
import com.ankush003.RecipeManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User LoginUser(String email, String password) {
        return userRepository.getUserByEmailAndPassword(email, password).orElse(null);
    }
}
