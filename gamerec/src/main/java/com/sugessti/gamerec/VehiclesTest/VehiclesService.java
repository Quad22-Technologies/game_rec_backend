package com.sugessti.gamerec.VehiclesTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VehiclesService {
    @Autowired
    private VehiclesRepository vehiclesRepository;

    // Create a new vehicle
    public Vehicles createVehicle(Vehicles vehicle) {
        return vehiclesRepository.save(vehicle);
    }

    // Retrieve all vehicles
    public List<Vehicles> getAllVehicles() {
        return vehiclesRepository.findAll();
    }

    // Retrieve a vehicle by ID
    public Optional<Vehicles> getVehicleById(UUID id) {
        return vehiclesRepository.findById(id);
    }

    // Update an existing vehicle
    public Vehicles updateVehicle(Vehicles vehicle) {
        return vehiclesRepository.save(vehicle);
    }

    // Delete a vehicle by ID
    public void deleteVehicle(UUID id) {
        vehiclesRepository.deleteById(id);
    }
}