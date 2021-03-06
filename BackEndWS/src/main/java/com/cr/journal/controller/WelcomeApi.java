package com.cr.journal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/public/welcome")
@Api(value = "WelcomeApi" , description = "This is a welcome controller API")
public interface WelcomeApi {

    @GetMapping(value = "/getWelcomeMessage", produces= {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Simple Hello Message ", notes="This is a public API", response= List.class)
    //@ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
    ResponseEntity getWelcomeMessage();

}
