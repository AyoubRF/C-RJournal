package com.cr.journal.controller.impl;

import com.cr.journal.controller.WelcomeApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class WelcomeApiImpl implements WelcomeApi {

    @Override
    public ResponseEntity getWelcomeMessage() {
        return new ResponseEntity("Welcome !", HttpStatus.OK);
    }

}
