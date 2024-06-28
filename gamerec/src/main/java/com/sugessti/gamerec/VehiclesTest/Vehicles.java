package com.sugessti.gamerec.VehiclesTest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
public class Vehicles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID vehicleid;
    private String make;
    private String model;
    private Integer year;
    private UUID vehicletypeid;
    private UUID dealerid;

    // Getters and Setters
    public UUID getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(UUID vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public UUID getVehicletypeid() {
        return vehicletypeid;
    }

    public void setVehicletypeid(UUID vehicletypeid) {
        this.vehicletypeid = vehicletypeid;
    }

    public UUID getDealerid() {
        return dealerid;
    }

    public void setDealerid(UUID dealerid) {
        this.dealerid = dealerid;
    }
}