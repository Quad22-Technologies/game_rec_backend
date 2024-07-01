package com.sugessti.gamerec;

import com.sugessti.gamerec.VehiclesTest.VehiclesController;
import com.sugessti.gamerec.VehiclesTest.VehiclesRepository;
import com.sugessti.gamerec.VehiclesTest.VehiclesService;
import com.sugessti.gamerec.Ports.PortsController;
import com.sugessti.gamerec.Ports.PortsRepository;
import com.sugessti.gamerec.Ports.PortsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses={VehiclesController.class, VehiclesRepository.class, VehiclesService.class,PortsController.class, PortsRepository.class, PortsService.class})

public class GamerecApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamerecApplication.class, args);
	}

}
