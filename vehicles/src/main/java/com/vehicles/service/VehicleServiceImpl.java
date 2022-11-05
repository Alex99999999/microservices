package com.vehicles.service;

import com.vehicles.domain.Vehicle;
import com.vehicles.domain.constants.FileFormat;
import com.vehicles.validation.FileFormatValidatorPlain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final FileFormatValidatorPlain fileFormatValidator;

    @Override
    public List<Vehicle> uploadDataFromFile(String filePath) {
        final String errorMessage = String.format("Wrong file format. Supported formats %s", Arrays.toString(FileFormat.values()));
        boolean isFormatSupported = this.fileFormatValidator.isValid(filePath);
        if(!isFormatSupported) {
            throw new IllegalStateException(errorMessage);
        }
        return new ArrayList<>();
    }

}
