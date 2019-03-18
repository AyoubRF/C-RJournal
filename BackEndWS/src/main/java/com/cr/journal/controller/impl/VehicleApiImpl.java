package com.cr.journal.controller.impl;


import com.cr.journal.controller.VehicleApi;
import com.cr.journal.entity.Vehicle;
import com.cr.journal.entity.VehicleForm;
import com.cr.journal.exceptions.VehicleNotFoundException;
import com.cr.journal.dao.repository.VehicleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.ResponseEntity.*;

@Component
public class VehicleApiImpl implements VehicleApi {

    private VehicleRepository vehicles;

    public VehicleApiImpl(VehicleRepository vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public ResponseEntity all() {
        return ok(this.vehicles.findAll());
    }

    @Override
    public ResponseEntity save(@RequestBody VehicleForm form, HttpServletRequest request) {
        Vehicle saved = this.vehicles.save(Vehicle.builder().name(form.getName()).build());
        return created(
                ServletUriComponentsBuilder
                        .fromContextPath(request)
                        .path("/api/vehicles/{id}")
                        .buildAndExpand(saved.getId())
                        .toUri())
                .build();
    }

    @Override
    public ResponseEntity get(@PathVariable("id") Long id) {
        return ok(this.vehicles.findById(id).orElseThrow(() -> new VehicleNotFoundException()));
    }

    @Override
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody VehicleForm form) {
        Vehicle existed = this.vehicles.findById(id).orElseThrow(() -> new VehicleNotFoundException());
        existed.setName(form.getName());

        this.vehicles.save(existed);
        return noContent().build();
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        Vehicle existed = this.vehicles.findById(id).orElseThrow(() -> new VehicleNotFoundException());
        this.vehicles.delete(existed);
        return noContent().build();
    }
}
