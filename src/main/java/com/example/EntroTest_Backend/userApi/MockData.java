package com.example.EntroTest_Backend.userApi;


import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class MockData {
    private Profile profile = new Profile();
    private Contact contact = new Contact();
    private Education education = new Education();
    private List<Education> educationList = new ArrayList<>();
    private List<Experience> experienceList = new ArrayList<>();
    private List<UserSkill> userSkillList = new ArrayList<>();
    private List<UserInterests> userInterestsList = new ArrayList<>();
    private List<Guild> guildList = new ArrayList<>();

    private Experience experience = new Experience();
    private UserSkill userSkill = new UserSkill();
    private UserInterests userInterests = new UserInterests();
    private Guild guild = new Guild();
    private UserProfileRespone userProfileRespone = new UserProfileRespone();

    public MockData() {
        this.setProfileData();
        this.setContactData();
        this.setEducationData();
        this.setExperienceData();
        this.setUserSkillData();
        this.setUserInterestsData();
        this.setGuildData();
        this.setListData();
        this.setUserProfileResponeData();
    }


    public void setProfileData() {
        profile.setFirstName("John");
        profile.setLastName("Doe");
        profile.setUserName("Mart");
        profile.setNickName("Mart");
        profile.setPosition("Developer");
        profile.setNationality("Thailand");
        profile.setStartDate(new Date());
        profile.setTelephoneNumber("0631156944");

    }

    public void setContactData() {
        contact.setAddress("Address");
        contact.setSubDistrict("SubDistrict");
        contact.setDistrict("District");
        contact.setProvince("Los Angeles");
        contact.setPostalCode("1234");
        contact.setFacebook("Test");
        contact.setLine("Test");
        contact.setInstagram("Test");
    }

    public void setEducationData() {
        education.setEducationDate(new Date());
        education.setUniversityName("University Name");
    }

    public void setExperienceData() {
        experience.setCompanyName("Google");
        experience.setPosition("Developer");
    }

    public void setUserSkillData() {
        userSkill.setName("python");
        userSkill.setLevel(10);
    }

    public void setUserInterestsData() {
        userInterests.setName("Java");
        userInterests.setName("SkateBoard");
    }

    public void setGuildData() {
        guild.setName("Java");
    }

    public void setListData() {
        this.educationList.add(education);
        this.experienceList.add(experience);
        this.userSkillList.add(userSkill);
        this.userInterestsList.add(userInterests);
        this.guildList.add(guild);
    }

    public void setUserProfileResponeData() {
        this.userProfileRespone.setProfile(profile);
        this.userProfileRespone.setContact(contact);
        this.userProfileRespone.setEducation(educationList);
        this.userProfileRespone.setExperience(experienceList);
        this.userProfileRespone.setSkills(userSkillList);
        this.userProfileRespone.setInterests(userInterestsList);
        this.userProfileRespone.setGuilds(guildList);
    }


}
