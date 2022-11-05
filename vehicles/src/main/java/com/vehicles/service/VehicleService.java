package com.vehicles.service;

import com.vehicles.domain.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> uploadDataFromFile(String filePath);
//    void createVehicle(VehicleRequestDto vehicleRequestDto);
}
