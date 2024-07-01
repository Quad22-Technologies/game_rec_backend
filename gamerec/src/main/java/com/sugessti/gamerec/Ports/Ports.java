package com.sugessti.gamerec.Ports;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import javax.persistence.Table;
import java.util.UUID;
import java.time.LocalDate;
@Entity
@Table




public class Ports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID PortsID;
    private String Platforms;
    private String Compatibility;
    


    public Ports(UUID PortsID, String Platforms, String Compatibility) {
        this.PortsID = PortsID;
        this.Platforms = Platforms;
        this.Compatibility = Compatibility;
        
    }

    public Ports() {
    }


    public UUID getPortsID(){
        return PortsID;
    }


    public  void setPortsID(UUID PortsID) {
        this.PortsID = PortsID;
    }


    public String getPlatform(){
        return Platforms;
    }


    public  void setPlatform(String platform) {
        this.Platforms = platform;
    }
    public String getCompatibility(){
        return  Compatibility;
    }


    public  void setCompatibility(String  Compatability) {
        this.Compatibility =  Compatability;
    }



    }


