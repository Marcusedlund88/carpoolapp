package com.example.carpoolapp.REPOSITORY;


import com.example.carpoolapp.DATA.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrentLocationRepository extends JpaRepository<Location, Long> {
    //List<Location> getLocationByUserId(long id);
}
