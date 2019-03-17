package com.cr.journal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Api(value = "UserInfoApi" , description = "User Infos Controller API")
public interface UserInfoApi {

    @GetMapping("/me")
    @ApiOperation(value="get current user infos", notes="This is a private API", response= List.class)
    public ResponseEntity currentUser(@AuthenticationPrincipal UserDetails userDetails);
}