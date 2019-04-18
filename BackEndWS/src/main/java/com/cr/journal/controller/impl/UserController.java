package com.cr.journal.controller.impl;

import com.cr.journal.dao.repository.UserRepository;
import com.cr.journal.dto.UserRequest;
import com.cr.journal.entity.User;
import com.cr.journal.util.PasswordGenerator;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {

    DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<UserRequest> getUsers(){

        List<User> userList = userRepository.findAll();
        List<UserRequest> userRequestList = new ArrayList<>();

        userList.parallelStream().forEach( user ->
                {
                    UserRequest ur = dozerBeanMapper.map(user, UserRequest.class);
                    userRequestList.add(ur);
                });

        return userRequestList;

    }
    @PostMapping("/")
    public UserRequest addUser(@RequestBody UserRequest userRequest){

          User  user= dozerBeanMapper.map(userRequest, User.class);
          user.setPassword(PasswordGenerator.generatePassword());
        //TODO : set password automatically

        userRepository.save(user);
        return  userRequest;
    }
}




/* ========  JUNKIES ======================================================================================
-- For Static getUsers() :
    UserRequest user1=new UserRequest(1,"mohammed","rabii","rabii20","064545","dff@ff.com","122444",roles);
    List<UserRequest> users=new ArrayList<>() ;
    users.add(user1);

-- For addUser() :
    User user=new User();
    user.setUsername(userRequest.getUsername());
    user.setIdUser(1);
    user.setLastname(userRequest.getLastname());
    user.setFirstname(userRequest.getFirstname());
    user.setEmail(userRequest.getEmail());
    user.setPassword("1245678");


 =============================================================================================================
 */
