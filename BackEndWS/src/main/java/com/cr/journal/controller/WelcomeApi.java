package com.cr.journal.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public interface WelcomeApi {

    @GetMapping(value = "/public/getWelcomeMessage", produces= {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Simple Hello Message ", notes="This is a public API", response= List.class)
    @ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
    ResponseEntity getWelcomeMessage();

}
