package com.sugessti.gamerec.Ports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.sound.sampled.Port;

@RestController
@RequestMapping("api/Ports")



public class PortsController {
    


    @Autowired
    private PortsService PortsService;

    
    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Ports> getAllPorts() {
        return PortsService.getAllPorts();
    }


    //returns one object because it's only looking for the record who's Id is the parameter
    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value="/getbyid/{id}", method= RequestMethod.GET)
    public Optional<Ports> getPortsById(@PathVariable("id") String id) {
        UUID updatePortsId = UUID.fromString(id);
        return PortsService.getPortsById(updatePortsId);
    }


    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value = "/update", method= RequestMethod.PUT)
    public Ports updateUser(@RequestBody Ports port) {
        return PortsService.updatePort(port);


    }

@RequestMapping(value = "/add", method= RequestMethod.POST)
    public Ports createPorts(@RequestBody Ports Ports) {
        
        return PortsService.save(Ports);
    }

}
