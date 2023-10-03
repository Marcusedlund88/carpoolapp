package com.example.carpoolapp.REPOSITORY;

import com.example.carpoolapp.DATA.AppUser;
import com.example.carpoolapp.DATA.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CurrentLocationRepositoryTest {

    @Autowired
    private CurrentLocationRepository currentLocationRepository;

    @Test
    void getLocationByIdAssertNotNull(){
        assertNotNull(currentLocationRepository.getLocationById(1));
    }

    @Test
    void getLocationByUserIdAssertNotNull() {

        assertNotNull(currentLocationRepository.findAll());
    }

    @Test
    void getLocationByUserIdAssertSizeOne(){
        List<Location> locations = currentLocationRepository.getLocationByAppUser_Id(1);
        assertEquals(locations.size(), 1);
    }
    @Test
    void getLocationByUserIdAssertEqual(){

        List<Location> locations = currentLocationRepository.getLocationByAppUser_Id(4);
        assertEquals(locations.get(0).getId(),4);
    }
}