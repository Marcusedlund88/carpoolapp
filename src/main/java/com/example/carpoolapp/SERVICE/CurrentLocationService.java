package com.example.carpoolapp.SERVICE;

import com.example.carpoolapp.DATA.AppUser;
import com.example.carpoolapp.REPOSITORY.CurrentLocationRepository;
import com.example.carpoolapp.REPOSITORY.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrentLocationService {

    private final UserRepository userRepository;
    private final CurrentLocationRepository currentLocationRepository;

    public void setCurrentLocation(AppUser appUser, String longitude, String latitude){



    }

}
