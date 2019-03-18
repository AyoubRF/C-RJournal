package com.cr.journal.repository;

import com.cr.journal.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Exposing Vehicle API via Repository interface directly (Spring Data Rest)
@RepositoryRestResource(path = "vehicle", collectionResourceRel = "vehicle", itemResourceRel = "vehicle")//NOT WORKING YET
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}