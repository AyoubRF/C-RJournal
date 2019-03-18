package com.cr.journal.util;

import com.cr.journal.entity.JUser;
import com.cr.journal.entity.Vehicle;
import com.cr.journal.repository.JUserRepository;
import com.cr.journal.repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    VehicleRepository vehicles;

    @Autowired
    JUserRepository users;

    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public void run(String... args) throws Exception {

        log.debug("initializing vehicles data...");
        this.vehicles.save(Vehicle.builder().name("moto").build());
        this.vehicles.save(Vehicle.builder().name("car").build());


        log.debug("printing all vehicles...");
        this.vehicles.findAll().forEach(v -> log.debug(" Vehicle :" + v.toString()));


        this.users.save(JUser.builder()
                .username("user")
                .password(this.passwordEncoder.encode("password"))
                .roles(Arrays.asList( "ROLE_USER"))
                .build()
        );

        this.users.save(JUser.builder()
                .username("admin")
                .password(this.passwordEncoder.encode("password"))
                .roles(Arrays.asList("ROLE_USER", "ROLE_ADMIN"))
                .build()
        );

        log.debug("printing all users...");
        this.users.findAll().forEach(v -> log.debug(" User :" + v.toString()));
    }


    }