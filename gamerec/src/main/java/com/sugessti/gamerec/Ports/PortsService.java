package com.sugessti.gamerec.Ports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service



public class PortsService {
    @Autowired
    private PortsRepository PortsRepository;  



    // Create a new vehicle
    public Ports createPort(Ports port) {
        return PortsRepository.save(port);
    }

    // Retrieve all vehicles
    public List<Ports> getAllPorts() {
        return PortsRepository.findAll();
    }

    // Retrieve a vehicle by ID
    public Optional<Ports> getPortsById(UUID id) {
        return PortsRepository.findById(id);
    }

    // Update an existing vehicle
    
    public Ports updatePort(Ports port) {
        PortsRepository.update(port);
        return port;
    }
    
   
    // Delete a vehicle by ID
    public void deletePort(UUID id) {
        PortsRepository.deleteById(id);
    }


}
