package com.example.EntroTest_Backend.userApi;


import lombok.Data;

import java.util.List;

@Data
public class UserProfileRespone {
    private Profile profile;
    private Contact contact;
    private List<Education> education;
    private List<Experience> experience;
    private List<UserSkill> skill;
    private List<UserInterests> interests;
    private List<Guild> guild;


//    public UserProfileRespone(Profile profile, Contract contract) {
//        this.profile = profile;
//        this.contract = contract;
//    }
}
