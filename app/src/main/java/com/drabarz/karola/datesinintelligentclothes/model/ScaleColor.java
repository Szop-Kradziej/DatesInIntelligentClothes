package com.drabarz.karola.datesinintelligentclothes.model;

/**
 * Created by karola on 13.12.15.
 */
public class ScaleColor {
    Integer color;
    Double scale;

    public ScaleColor(){

    }

    public ScaleColor(Integer color, Double scale) {
        this.color = color;
        this.scale = scale;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }
}
