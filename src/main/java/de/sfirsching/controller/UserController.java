package de.sfirsching.controller;

import de.sfirsching.entity.request.DeleteUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.sfirsching.entity.User;
import de.sfirsching.entity.request.AddUserRequest;
import de.sfirsching.repository.UserRepository;
import javax.sql.DataSource;

import java.util.List;

/**
 * Created by whoffer on 2/22/2017.
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value="/post", method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest) {
        System.out.println("User erstellen");
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);
    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public void deleteUser(@RequestBody DeleteUserRequest deleteUserRequest) {
        List<User> users = userRepository.findByNameAndSurname(deleteUserRequest.getName(), deleteUserRequest.getSurname());
        for(User u: users){
            userRepository.delete(u);
        }
    }
}
