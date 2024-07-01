package com.sugessti.gamerec.VehiclesTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/vehicles")
public class VehiclesController {
    @Autowired
    private VehiclesService vehiclesService;
    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Vehicles> getAllVehicles() {
        return vehiclesService.getAllVehicles();
    }

    //returns one object because it's only looking for the record who's Id is the parameter
    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value="/getbyid/{id}", method= RequestMethod.GET)
    public Optional<Vehicles> getVehicleById(@PathVariable("id") String id) {
        UUID updatevehicleId = UUID.fromString(id);
        return vehiclesService.getVehicleById(updatevehicleId);
    }

    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value = "/update", method= RequestMethod.PUT)
    public Vehicles updateUser(@RequestBody Vehicles vehicle) {
        return vehiclesService.updateVehicle(vehicle);

    }


}