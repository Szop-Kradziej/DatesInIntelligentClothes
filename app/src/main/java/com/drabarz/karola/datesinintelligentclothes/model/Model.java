package com.drabarz.karola.datesinintelligentclothes.model;

/**
 * Created by karola on 13.12.15.
 */
public class Model {
    UserProfile userProfile;

    public Model() {
        userProfile = new UserProfile();
        setExampleUserProfile();
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    void setExampleUserProfile() {
        userProfile.setNickname("Szop-kradziej");
        userProfile.setAge(24);
        userProfile.setGender("FEMALE");
        Location location = new Location("1","1");
        userProfile.setLocation(location);
        userProfile.setSize("S");
    }
}
