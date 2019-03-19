package com.cr.journal.controller.impl;

import com.cr.journal.controller.WelcomeApi;
import com.cr.journal.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;



@Component
public class WelcomeApiImpl implements WelcomeApi {


    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity getWelcomeMessage() {
        return new ResponseEntity("Welcome !", HttpStatus.OK);
    }

}
