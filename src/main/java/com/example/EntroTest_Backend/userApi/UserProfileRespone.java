package com.example.EntroTest_Backend.userApi;


import lombok.Data;

import java.util.List;

@Data
public class UserProfileRespone {
    private Profile profile;
    private Contract contract;
    private List<Education> educationList;
    private List<Experience> experienceList;
    private List<UserSkill> userSkillList;
    private List<UserInterests> userInterestsList;
    private List<Guild> guildList;

}
