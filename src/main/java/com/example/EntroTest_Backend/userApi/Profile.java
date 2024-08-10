package com.example.EntroTest_Backend.userApi;

import lombok.Data;

import java.util.Date;

@Data
public class Profile {
    private String userName;
    private String nickName;
    private String firstName;
    private String lastName;
    private String position;
    private String nationality;
    private String telephoneNumber;
    private Date startDate;
}
