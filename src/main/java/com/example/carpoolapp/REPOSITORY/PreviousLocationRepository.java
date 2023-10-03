package com.example.carpoolapp.REPOSITORY;

import com.example.carpoolapp.DATA.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviousLocationRepository extends JpaRepository<Location, Long> {
   // Location getLocationByUserId();
}