package com.example.rhsalhuman.entities;

import com.example.rhsalhuman.repositories.UserRepository;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.PrePersist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


@EntityListeners(UserListener.class)
public class UserListener {

    @Lazy
   // @Autowired
    private PasswordEncoder encoder;

    //@Autowired
    private UserRepository userRepository;


    @PrePersist
    public void prePersist(User user)
    {
        Optional<User> userOptional = userRepository.findByUsername(user.getUsername());

        if(userOptional.isPresent())
        {
            User currentUser = userOptional.get();
            if(verifyPassword(user.getPassword(), currentUser.getPassword()))
            {
                user.setPassword(encoder.encode(user.getPassword()));
            }
        }else{
            user.setPassword(encoder.encode(user.getPassword()));
        }
    }

    public boolean verifyPassword(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }
}
