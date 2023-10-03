package com.example.carpoolapp.CONFIGURATION;

import com.example.carpoolapp.DATA.AppUser;
import com.example.carpoolapp.DATA.Location;
import com.example.carpoolapp.REPOSITORY.CurrentLocationRepository;
import com.example.carpoolapp.REPOSITORY.PreviousLocationRepository;
import com.example.carpoolapp.REPOSITORY.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class cmdLineRunner {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository
            , CurrentLocationRepository currentLocationRepository
            , PreviousLocationRepository previousLocationRepository){
        return args->{

            userRepository.save(new AppUser("dummyOne"));
            userRepository.save(new AppUser("dummyTwo"));
            userRepository.save(new AppUser("dummyThree"));
            userRepository.save(new AppUser("dummyFour"));
            userRepository.save(new AppUser("dummyFive"));

            currentLocationRepository.save(new Location(userRepository.findByName("dummyOne")
                    , "dummyLongOne"
                    , "dummyLatOne"));

            currentLocationRepository.save(new Location(userRepository.findByName("dummyTwo")
                    , "dummyLongTwo"
                    , "dummyLatTwo"));

            currentLocationRepository.save(new Location(userRepository.findByName("dummyThree")
                    , "dummyLongThree"
                    , "dummyLatThree"));

            currentLocationRepository.save(new Location(userRepository.findByName("dummyFour")
                    , "dummyLongFour"
                    , "dummyLatFour"));

            currentLocationRepository.save(new Location(userRepository.findByName("dummyFive")
                    , "dummyLongFive"
                    , "dummyLatFive"));

            previousLocationRepository.save(currentLocationRepository.getLocationById(1));

            previousLocationRepository.save(currentLocationRepository.getLocationById(2));
        };
    }

}
