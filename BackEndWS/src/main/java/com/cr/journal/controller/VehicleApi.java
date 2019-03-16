package com.cr.journal.controller;

import com.cr.journal.entity.VehicleForm;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/api/vehicles")
public interface VehicleApi {

    @GetMapping(value = "", produces= {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Getting All Vehicules", notes="This is a public API", response= List.class)
    ResponseEntity all();

    @PostMapping(value = "", produces= {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Saving a Vehicule", notes="This is a private API", response= List.class)
    ResponseEntity save(@RequestBody VehicleForm form, HttpServletRequest request);


    @GetMapping("/{id}")
    @ApiOperation(value="Getting a Vehicule by its ID", notes="This is a private API", response= List.class)
    ResponseEntity get(@PathVariable("id") Long id);


    @PutMapping("/{id}")
    @ApiOperation(value="Updating a Vehicule by its ID", notes="This is a private API", response= List.class)
    ResponseEntity update(@PathVariable("id") Long id, @RequestBody VehicleForm form);



    @DeleteMapping("/{id}")
    @ApiOperation(value="Deleting a Vehicule by its ID", notes="This is a private API", response= List.class)
    ResponseEntity delete(@PathVariable("id") Long id);



}
