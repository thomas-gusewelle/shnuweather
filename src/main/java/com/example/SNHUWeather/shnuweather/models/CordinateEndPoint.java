package com.example.SNHUWeather.shnuweather.models;


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



  static class Properties {
  private String gridId;
  private String gridX;
  private String gridY;

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
 }
}
