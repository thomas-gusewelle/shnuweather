package com.example.SNHUWeather.shnuweather.models;

import java.util.ArrayList;

// Model for the forecast api endpoint
// See https://www.weather.gov/documentation/services-web-api
public class WeatherEndPoint {
private Properties properties;

    // Getter Methods
    public Properties getProperties() {
        return this.properties;
    }
    public ArrayList<Period> getPeriods(){
        return this.properties.getPeriods();
    }
    public String getGeneratedAt(){
        return this.properties.getGeneratedAt();
    }

    // Setter Methods
    public void setProperties(Properties propertiesObject) {
        this.properties = propertiesObject;
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
    private final ArrayList<Period> periods = new ArrayList<>();


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

    public ArrayList<Period> getPeriods() {
        return periods;
    }
}

class Dewpoint {
    private String unitCode;
    private double value;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

class RelativeHumidity {
    private String unitCode;
    private int value;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
