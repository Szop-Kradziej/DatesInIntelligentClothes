package com.drabarz.karola.datesinintelligentclothes.model;

public class UserProfile {

    String nickname;
    String gender;
    Integer age;
    Location location;
    String size;

    public UserProfile(){

    }

    public UserProfile(String nickname, String size, Integer age, Location location, String gender) {
        this.nickname = nickname;
        this.size = size;
        this.age = age;
        this.location = location;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
