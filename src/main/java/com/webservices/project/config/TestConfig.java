package com.webservices.project.config;

import com.webservices.project.entities.User;
import com.webservices.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "981561717", "12345");
        User u2 = new User(null, "Alex Brown", "alex@gmail.com", "981561716", "132345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
