package com.sugessti.gamerec.Audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/gamerec/audit")

public class AuditController {
    @Autowired
    private AuditService auditService;
    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Audit> getAllAudits() {
        return auditService.getAudits();
    }

    //returns one object because it's only looking for the record who's Id is the parameter
    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value="/getbyid/{id}", method= RequestMethod.GET)
    public Optional<Audit> getAuditById(@PathVariable("id") String id) {
        UUID updateauditId = UUID.fromString(id);
        return auditService.getAuditByID(updateauditId);
    }

    @CrossOrigin(origins = "*") //@CrossOrigin annotation enables cross-origin resource sharing only for this specific method
    @RequestMapping(value = "/update", method= RequestMethod.PUT)
    public Audit updateAudit(@RequestBody Audit audit) {
        return auditService.updateAudit(audit);

    }
}
