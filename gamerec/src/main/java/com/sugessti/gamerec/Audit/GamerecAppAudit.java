package com.sugessti.gamerec.Audit;

import com.sugessti.gamerec.GamerecApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses={AuditController.class, AuditRepository.class, AuditService.class})

public class GamerecAppAudit {
    public static void main(String[] args) {
		SpringApplication.run(GamerecApplication.class, args);
	}
}
