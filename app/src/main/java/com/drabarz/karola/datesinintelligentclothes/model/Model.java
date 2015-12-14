package com.drabarz.karola.datesinintelligentclothes.model;

public class Model {
    UserProfile userProfile;
    UserPreferences userPreferences;

    public Model() {
        userProfile = new UserProfile();
        userPreferences = new UserPreferences();
        setExampleUserProfile();
    }

    void setExampleUserProfile() {
        userProfile.setNickname("Szop-kradziej");
        userProfile.setAge(24);
        userProfile.setGender("FEMALE");
        Location location = new Location("1","1");
        userProfile.setLocation(location);
        userProfile.setSize("S");
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public UserPreferences getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(UserPreferences userPreferences) {
        this.userPreferences = userPreferences;
    }
}
