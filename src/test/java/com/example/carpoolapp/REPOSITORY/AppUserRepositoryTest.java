package com.example.carpoolapp.REPOSITORY;

import com.example.carpoolapp.DATA.AppUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AppUserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUsers(){
        List<AppUser> appUsers = userRepository.findAll();
        System.out.println(appUsers);
        System.out.println("wait");
    }

}