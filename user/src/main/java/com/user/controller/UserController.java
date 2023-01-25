package com.user.controller;

import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/all")
    public List<User> getAllUser(){
        return service.getAllUser();
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable int userid){
        return service.getUser(userid);
    }
    @PostMapping("/save")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }
    @PutMapping("/update")
    public User putUser(@RequestBody User user){
        return service.updateUser(user);
    }
    @DeleteMapping("/delete")
    public Optional<User> deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}
