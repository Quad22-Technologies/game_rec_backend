package com.sugessti.gamerec.VehiclesTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, UUID> {


}
