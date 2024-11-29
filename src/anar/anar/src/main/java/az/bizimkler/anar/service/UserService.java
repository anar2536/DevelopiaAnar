package anar.anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import anar.anar.src.main.java.az.bizimkler.anar.repository.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }

    public boolean userExists(String username) {
        return userRepository.findByUsername(username) != null;
    }
}
