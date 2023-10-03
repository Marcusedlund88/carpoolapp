/*
package com.example.carpoolapp.SERVICE;

import com.example.carpoolapp.DATA.AppUser;
import com.example.carpoolapp.REPOSITORY.CurrentLocationRepository;
import com.example.carpoolapp.REPOSITORY.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class CurrentLocationServiceTest {

    @Autowired
    private CurrentLocationService currentLocationService;

    private UserRepository userRepository;
    private CurrentLocationRepository currentLocationRepository;
    private AppUser appUser;
    private String longitude;
    private String latitude;

    @BeforeEach
    public void makeDummyCoordinates(){
        longitude = "dummyLong";
        latitude = "dummyLat";
    }

    @Test
    void setCurrentLocation() {
        appUser = new AppUser(1, "dummyName");
        currentLocationService.setCurrentLocation(appUser, longitude, latitude);
        //assertEquals(currentLocationRepository.getLocationByUserId(user.getId()).size(), 1);
    }

}*/
