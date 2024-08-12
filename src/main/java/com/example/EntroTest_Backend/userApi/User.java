package com.example.EntroTest_Backend.userApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    private List<UserRespone> users = new ArrayList<>();
    private MockData mockData = new MockData();
//    private List<MockData> mockDataList = new ArrayList<>();

    @GetMapping
    public List<UserRespone> getUser() {
        return users;
    }

    @GetMapping("/test")
    public UserRespone test() {
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

    @GetMapping("mockdata")
    public List<UserProfileRespone> getMockData() {
        List<UserProfileRespone> mockDataList = new ArrayList<>();
        mockDataList.add(mockData.getUserProfileRespone());
        return mockDataList;
    }

    @PutMapping()
    @RequestMapping("/mockdata/update")
    public ResponseEntity<UserProfileRespone> putMockData(@RequestBody UserProfileRespone updatedMockData) {
        try {
            this.mockData.getUserProfileRespone().setProfile(updatedMockData.getProfile());
            this.mockData.getUserProfileRespone().setContact(updatedMockData.getContact());
            this.mockData.getUserProfileRespone().setEducation(updatedMockData.getEducation());
            this.mockData.getUserProfileRespone().setExperience(updatedMockData.getExperience());
            this.mockData.getUserProfileRespone().setSkill(updatedMockData.getSkill());
            this.mockData.getUserProfileRespone().setInterests(updatedMockData.getInterests());
            this.mockData.getUserProfileRespone().setGuild(updatedMockData.getGuild());
            return new ResponseEntity<>(mockData.getUserProfileRespone(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
