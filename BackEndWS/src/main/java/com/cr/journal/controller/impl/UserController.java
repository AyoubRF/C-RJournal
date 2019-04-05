package com.cr.journal.controller.impl;

import com.cr.journal.dto.UserRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/")
    List<UserRequest> getusers(){
        UserRequest user1=new UserRequest("mohammed","rabii","rabii20","064545","dff@ff.com");
        UserRequest user2=new UserRequest("mohammed","rabii","rabii20","064545","dff@ff.com");
        UserRequest user3=new UserRequest("mohammed","rabii","rabii20","064545","dff@ff.com");
        UserRequest user4=new UserRequest("mohammed","rabii","rabii20","064545","dff@ff.com");
        List<UserRequest> users=new ArrayList<UserRequest>() ;
        users.add(user1);
        users.add(user1);
        users.add(user1);
        users.add(user1);
        users.add(user1);
        return users;

    }
}
