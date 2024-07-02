package com.sugessti.gamerec.Audit;

import java.time.LocalDate;
import java.util.UUID;

public class Audit {

        private UUID AuditID;
        private LocalDate EventTime;
        private UUID UsernameID;
        private String OperationType;
        private LocalDate ExitEntryTime;
        private LocalDate Edit;
        private String Changes;

        //getter and setter

        public UUID getAuditID(){
            return AuditID;
        }

        public void setAuditID(UUID AuditID){
            this.AuditID = AuditID;
        }

        public LocalDate getEventTime(){
            return EventTime;
        }

        public void setEventTime(LocalDate EventTime){
            this.EventTime = EventTime;
        }

        public UUID getUsernameID(){
            return UsernameID;
        }

        public void setUsernameID(UUID UsernameID){
            this.UsernameID = UsernameID;
        }

        public String getOperationType(){
            return OperationType;
        }

        public void setOperationType(String OperationType){
            this.OperationType = OperationType;
        }

        public LocalDate getExitEntryTime(){
            return ExitEntryTime;
        }

        public void setExitEntryTime(LocalDate ExitEntryTime){
            this.ExitEntryTime = ExitEntryTime;
        }

        public LocalDate getEdit(){
            return Edit;
        }

        public void setEdit(LocalDate Edit){
            this.Edit = Edit;
        }

        public String getChanges(){
            return Changes;
        }

        public void setChanges(String Changes){
            this.Changes = Changes;
        }

}
