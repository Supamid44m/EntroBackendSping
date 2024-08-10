package com.example.EntroTest_Backend.userApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    private List<UserRespone> users = new ArrayList<>();

    @GetMapping
    public List<UserRespone> getUser() {
        return users;
    }

    @GetMapping("/test")
    public UserRespone test(){
        UserRespone user = new UserRespone();
        user.setUserName("test");
        user.setFirstName("test");
        return user;

    }

    @PostMapping()
    @RequestMapping("/create")
    public UserRespone postUser(@RequestBody UserRespone user) {
        users.add(user);
        return user;
    }
}
