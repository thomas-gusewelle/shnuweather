package com.example.SNHUWeather.shnuweather.models;


//Model for the coordinate api endpoint
// see https://www.weather.gov/documentation/services-web-api
public class CordinateEndPoint {
 private String id;
private Properties properties;

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public Properties getProperties() {
  return properties;
 }

 public void setProperties(Properties properties) {
  this.properties = properties;
 }

 public String getGridX(){
  return this.properties.gridX;
 }

 public String getGridY(){
  return this.properties.gridY;
 }
 public String getGridId(){
  return this.properties.gridId;
 }
 public String getCity(){
  return this.properties.relativeLocation.getProperties().getCity();
 }
 public String getState(){
  return this.properties.relativeLocation.getProperties().getState();
 }




 static class Properties {
  private String gridId;
  private String gridX;
  private String gridY;

  private RelativeLocation relativeLocation;
  public String getGridId() {
   return gridId;
  }

  public void setGridId(String gridId) {
   this.gridId = gridId;
  }

  public String getGridX() {
   return gridX;
  }

  public void setGridX(String gridX) {
   this.gridX = gridX;
  }

  public String getGridY() {
   return gridY;
  }

  public void setGridY(String gridY) {
   this.gridY = gridY;
  }
  public RelativeLocation getRelativeLocation() {
   return relativeLocation;
  }

  public void setRelativeLocation(RelativeLocation relativeLocation) {
   this.relativeLocation = relativeLocation;
  }
 }
}


class RelativeLocation {
 private RLProperties properties;

 public RLProperties getProperties() {
  return properties;
 }

 public void setProperties(RLProperties properties) {
  this.properties = properties;
 }
}

class RLProperties{
 private String city;
 private String state;

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }

 public String getState() {
  return state;
 }

 public void setState(String state) {
  this.state = state;
 }
}
