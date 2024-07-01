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
    private LocalDate CreatedDate;
    private LocalDate ModifiedDate;


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


    public LocalDate getCreatedDate(){
        return  CreatedDate;
    }


    public  void setCreatedDate(LocalDate  CreatedDate) {
        this.CreatedDate = CreatedDate;
    }
    public LocalDate getModifiedDate(){
        return  ModifiedDate;
    }


    public  void setModifiedDate(LocalDate  ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }

}
