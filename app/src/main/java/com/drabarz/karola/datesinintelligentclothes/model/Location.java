package com.drabarz.karola.datesinintelligentclothes.model;

/**
 * Created by karola on 13.12.15.
 */
public class Location {

    String Longitude;
    String Lattitude;

    public Location(String longitude, String lattitude) {
        Longitude = longitude;
        Lattitude = lattitude;
    }

    public String getLattitude() {
        return Lattitude;
    }

    public String getLongitude() {
        return Longitude;
    }
}
