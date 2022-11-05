package com.vehicles.controller;

import com.vehicles.annotation.ValidateFileFormat;
import com.vehicles.domain.Vehicle;
import com.vehicles.repository.VehicleRepository;
import com.vehicles.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehiclesController {

    private final VehicleService vehicleService;
    private final VehicleRepository vehicleRepository;

    @GetMapping("/test")
    String test() {
        return "Hello!";
    }

    @PostMapping("/upload")
    List<Vehicle> uploadDataFromFile(@ValidateFileFormat @RequestParam String filePath) {
        return this.vehicleService.uploadDataFromFile(filePath);
    }

    @PostMapping("/all")
    List<Vehicle> getAll() {
        return this.vehicleRepository.findAll();
    }

}
