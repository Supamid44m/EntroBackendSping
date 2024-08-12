package com.example.EntroTest_Backend.userApi;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Data
public class MockData {
    private Profile profile = new Profile();
    private Contact contact = new Contact();
    private List<Education> educationList = new ArrayList<>();
    private List<Experience> experienceList = new ArrayList<>();
    private List<UserSkill> userSkillList = new ArrayList<>();
    private List<UserInterests> userInterestsList = new ArrayList<>();
    private List<Guild> guildList = new ArrayList<>();

    private UserProfileRespone userProfileRespone = new UserProfileRespone();

    public MockData() {
        this.setProfileData();
        this.setContactData();
        this.setEducationData();
        this.setExperienceData();
        this.setUserSkillData();
        this.setUserInterestsData();
        this.setGuildData();
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
        for (int i = 1; i <= 3; i++) {
            Education education = new Education();
            education.setEducationDate("Year" + i);
            education.setUniversityName("University Name " + i);
            educationList.add(education);
        }
    }

    public void setExperienceData() {
        for (int i = 1; i <= 3; i++) {
            Experience experience = new Experience();
            experience.setCompanyName("Company " + i);
            experience.setPosition("Position " + i);
            experienceList.add(experience);
        }
    }

    public void setUserSkillData() {
        Random rand = new Random();
        for (int i = 1; i <= 3; i++) {
            int randomSkillLevel = rand.nextInt(10);
            UserSkill userSkill = new UserSkill();
            userSkill.setName("Skill " + i);
            userSkill.setLevel(randomSkillLevel);
            userSkillList.add(userSkill);
        }
    }

    public void setUserInterestsData() {
        for (int i = 1; i <= 3; i++) {
            UserInterests userInterests = new UserInterests();
            userInterests.setName("Interest " + i);
            userInterestsList.add(userInterests);
        }
    }

    public void setGuildData() {
        for (int i = 1; i <= 3; i++) {
            Guild guild = new Guild();
            guild.setName("Guild " + i);
            guildList.add(guild);
        }
    }

    public void setUserProfileResponeData() {
        this.userProfileRespone.setProfile(profile);
        this.userProfileRespone.setContact(contact);
        this.userProfileRespone.setEducation(educationList);
        this.userProfileRespone.setExperience(experienceList);
        this.userProfileRespone.setSkill(userSkillList);
        this.userProfileRespone.setInterests(userInterestsList);
        this.userProfileRespone.setGuild(guildList);
    }
}
