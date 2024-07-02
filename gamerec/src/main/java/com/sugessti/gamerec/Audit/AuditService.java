package com.sugessti.gamerec.Audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuditService {
    @Autowired
    private AuditRepository auditRepository;

    //create a new audit
    public Audit createAudit(Audit audit) {
        return auditRepository.save(audit);
    }

    // Retrieve all audits
    public List<Audit> getAudits() {
        return auditRepository.findAll();
    }

    // Retrieve a audit by ID
    public Optional<Audit> getAuditByID(UUID id) {
        return auditRepository.findById(id);
    }

    // Update an existing audit
    public Audit updateAudit(Audit audit) {
        return auditRepository.save(audit);
    }

    // Delete a audit by ID
    public void deleteAudit(UUID id) {
        auditRepository.deleteById(id);
    }
}
