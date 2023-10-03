package com.example.carpoolapp.REPOSITORY;

import com.example.carpoolapp.DATA.AppUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class AppUserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUsers(){
        List<AppUser> appUsers = userRepository.findAll();
        assertEquals(appUsers.size(), 5);
    }

}