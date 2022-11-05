package com.vehicles.repository;

import com.vehicles.domain.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Primary
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {

    @Query(value = "Select * from vehicle v join car c on v.id = c.id",
            nativeQuery = true)
    List<Vehicle> retrieveAll();

}
