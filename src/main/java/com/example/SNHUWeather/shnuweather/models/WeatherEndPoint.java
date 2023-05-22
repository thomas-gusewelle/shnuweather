package com.example.SNHUWeather.shnuweather.models;

import java.util.ArrayList;

public class WeatherEndPoint {
    Properties PropertiesObject;


    // Getter Methods

    public Properties getProperties() {
        return PropertiesObject;
    }

    // Setter Methods

    public void setProperties(Properties propertiesObject) {
        this.PropertiesObject = propertiesObject;
    }
}
class Properties {
    private String updated;
    private String units;
    private String forecastGenerator;
    private String generatedAt;
    private String updateTime;
    private String validTimes;
    Elevation ElevationObject;
    ArrayList< Object > periods = new ArrayList < Object > ();


    // Getter Methods

    public String getUpdated() {
        return updated;
    }

    public String getUnits() {
        return units;
    }

    public String getForecastGenerator() {
        return forecastGenerator;
    }

    public String getGeneratedAt() {
        return generatedAt;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getValidTimes() {
        return validTimes;
    }

    public Elevation getElevation() {
        return ElevationObject;
    }

    // Setter Methods

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void setForecastGenerator(String forecastGenerator) {
        this.forecastGenerator = forecastGenerator;
    }

    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setValidTimes(String validTimes) {
        this.validTimes = validTimes;
    }

    public void setElevation(Elevation elevationObject) {
        this.ElevationObject = elevationObject;
    }
}
class Elevation {
    private String unitCode;
    private float value;


    // Getter Methods

    public String getUnitCode() {
        return unitCode;
    }

    public float getValue() {
        return value;
    }

    // Setter Methods

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
