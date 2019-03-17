package com.cr.journal.controller;

import com.cr.journal.util.AuthenticationRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
@Api(value = "AuthApi" , description = "Authentication Controller API")
public interface AuthApi {

    @PostMapping("/signin")
    @ApiOperation(value="Signin Method with Username and Password", notes="This is a public API", response= List.class)
    ResponseEntity signin(@RequestBody AuthenticationRequest data);

}
