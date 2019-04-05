//package com.cr.journal.util;
//
//import com.cr.journal.dao.repository.UserRepository;
//import com.cr.journal.dto.UserRequest;
//import com.cr.journal.entity.User;
//import com.cr.journal.entity.Vehicle;
//import com.cr.journal.dao.repository.VehicleRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.dozer.DozerBeanMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//
//@Component
//@Slf4j
//public class DataInitializer implements CommandLineRunner {
//
//    @Autowired
//    VehicleRepository vehicles;
//
//    @Autowired
//    UserRepository users;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Autowired
//    UserRepository userRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        log.debug("initializing vehicles data...");
//        this.vehicles.save(Vehicle.builder().name("moto").build());
//        this.vehicles.save(Vehicle.builder().name("car").build());
//
//
//        log.debug("printing all vehicles...");
//        this.vehicles.findAll().forEach(v -> log.debug(" Vehicle :" + v.toString()));
//
//
//        this.users.save(User.builder()
//                .username("user")
//                .password(this.passwordEncoder.encode("password"))
//                .roles(Arrays.asList("ROLE_USER"))
//                .build()
//        );
//
//        this.users.save(User.builder()
//                .username("admin")
//                .password(this.passwordEncoder.encode("password"))
//                .roles(Arrays.asList("ROLE_USER", "ROLE_ADMIN"))
//                .build()
//        );
//
//        log.info("printing all users...");
//        this.users.findAll().forEach(v -> log.info(" User :" + v.getUsername() + v.getPassword()));
//        System.out.println();
//
//        this.userRepository.save(User.builder().username("FIRST USER").password(this.passwordEncoder.encode("123456987")).build());
//        log.info("FIIIRSTTT USEERR..");
//        this.userRepository.findAll().forEach(v -> log.info(" FIRST USER :" + v.getUsername() + v.getPassword()));
//
//        //======= DTO =========//
////        User user = new User();
////        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
////        user.setUsername("dto user");
////        user.setPassword("123456987");
////        user.setFirstname("dvdv");
////        user.setLastname("ddfdf");
////
////        userRepository.save(user);
////
////        UserRequest ur = new UserRequest();
////
////        UserRequest userRequest = dozerBeanMapper.map(user,UserRequest.class);
////
////        System.out.println(userRequest.getUsername()+"  UUU  "+userRequest.getPassword());
////
////        UserRequest userRequest = new UserRequest();
////        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
////        userRequest.setUsername("dto useeer");
////        userRequest.setPassword(this.passwordEncoder.encode("123456789"));
////        userRequest.setFirstname("dvvvdv");
////        userRequest.setLastname("ddfdddf");
////
////        User user = dozerBeanMapper.map(userRequest, User.class);
////
////        userRepository.save(user);
////
////        log.info(userRequest.getUsername()+"  UUUUU  "+userRequest.getPassword());
////    }
////
////}
////
//
//
