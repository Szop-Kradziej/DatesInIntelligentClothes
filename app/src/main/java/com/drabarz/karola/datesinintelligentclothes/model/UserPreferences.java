package com.drabarz.karola.datesinintelligentclothes.model;

import java.util.ArrayList;

/**
 * Created by karola on 13.12.15.
 */
public class UserPreferences {
    String gender;
    Integer ageFrom;
    Integer ageTo;
    Double locationDistance;
    String sizeFrom;
    String sizeTo;
    ArrayList<ScaleColor> scaleColors = new ArrayList<>();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<ScaleColor> getScaleColors() {
        return scaleColors;
    }

    public void setScaleColors(ArrayList<ScaleColor> scaleColors) {
        this.scaleColors = scaleColors;
    }

    public String getSizeTo() {
        return sizeTo;
    }

    public void setSizeTo(String sizeTo) {
        this.sizeTo = sizeTo;
    }

    public String getSizeFrom() {
        return sizeFrom;
    }

    public void setSizeFrom(String sizeFrom) {
        this.sizeFrom = sizeFrom;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }

    public Double getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(Double locationDistance) {
        this.locationDistance = locationDistance;
    }

    public Integer getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
    }
}
