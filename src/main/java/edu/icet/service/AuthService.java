package edu.icet.service;

import edu.icet.model.dto.LoginDTO;
import edu.icet.model.entity.User;
import edu.icet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User login(LoginDTO loginDto) {
        Optional<User> userOptional = Optional.ofNullable(userRepository.findByEmail(loginDto.getEmail()));

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(loginDto.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
