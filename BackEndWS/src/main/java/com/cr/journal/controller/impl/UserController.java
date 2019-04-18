package com.cr.journal.controller.impl;

import com.cr.journal.dao.repository.UserRepository;
import com.cr.journal.dto.UserRequest;
import com.cr.journal.entity.User;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    DozerBeanMapper dozerBeanMapper;
    @Autowired
    UserRepository userRepository;
//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;
    @GetMapping("/")
    public List<UserRequest> getusers(){
        List<String>roles=new ArrayList<>();
        roles.add("admin");
        UserRequest user1=new UserRequest(1,"mohammed","rabii","rabii20","064545","dff@ff.com","122444",roles);
        UserRequest user2=new UserRequest(null,"mohammed","rabii","rabii20","064545","dff@ff.com","1222222",roles);
        UserRequest user3=new UserRequest(null,"mohammed","rabii","rabii20","064545","dff@ff.com","1111111",roles);
        UserRequest user4=new UserRequest(null,"mohammed","rabii","rabii20","064545","dff@ff.com","111111111",roles);
        List<UserRequest> users=new ArrayList<UserRequest>() ;
        users.add(user1);
        users.add(user1);
        users.add(user1);
        users.add(user1);
        users.add(user1);
        return users;

    }
    @PostMapping("/")
    public UserRequest adduser(@RequestBody UserRequest userRequest){

          User  user=dozerBeanMapper.map(userRequest, User.class);
//        User user=new User();
//        user.setUsername(userRequest.getUsername());
//        user.setIdUser(1);
//        user.setLastname(userRequest.getLastname());
//        user.setFirstname(userRequest.getFirstname());
//        user.setEmail(userRequest.getEmail());
//        user.setPassword("1245678");
       System.out.println(user.getFirstname());
         userRepository.save(user);
         return  userRequest;
    }
}


