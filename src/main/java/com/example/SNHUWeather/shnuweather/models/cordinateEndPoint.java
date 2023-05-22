package com.example.SNHUWeather.shnuweather;

public class Codebeautify {
 ArrayList < Object > @context = new ArrayList < Object > ();
 private String id;
 private String type;
 Geometry GeometryObject;
 Properties PropertiesObject;


 // Getter Methods 

 public String getId() {
  return id;
 }

 public String getType() {
  return type;
 }

 public Geometry getGeometry() {
  return GeometryObject;
 }

 public Properties getProperties() {
  return PropertiesObject;
 }

 // Setter Methods 

 public void setId(String id) {
  this.id = id;
 }

 public void setType(String type) {
  this.type = type;
 }

 public void setGeometry(Geometry geometryObject) {
  this.GeometryObject = geometryObject;
 }

 public void setProperties(Properties propertiesObject) {
  this.PropertiesObject = propertiesObject;
 }
}
public class Properties {
 private String @id;
 private String @type;
 private String cwa;
 private String forecastOffice;
 private String gridId;
 private float gridX;
 private float gridY;
 private String forecast;
 private String forecastHourly;
 private String forecastGridData;
 private String observationStations;
 RelativeLocation RelativeLocationObject;
 private String forecastZone;
 private String county;
 private String fireWeatherZone;
 private String timeZone;
 private String radarStation;


 // Getter Methods 

 public String get @id() {
  return @id;
 }

 public String get @type() {
  return @type;
 }

 public String getCwa() {
  return cwa;
 }

 public String getForecastOffice() {
  return forecastOffice;
 }

 public String getGridId() {
  return gridId;
 }

 public float getGridX() {
  return gridX;
 }

 public float getGridY() {
  return gridY;
 }

 public String getForecast() {
  return forecast;
 }

 public String getForecastHourly() {
  return forecastHourly;
 }

 public String getForecastGridData() {
  return forecastGridData;
 }

 public String getObservationStations() {
  return observationStations;
 }

 public RelativeLocation getRelativeLocation() {
  return RelativeLocationObject;
 }

 public String getForecastZone() {
  return forecastZone;
 }

 public String getCounty() {
  return county;
 }

 public String getFireWeatherZone() {
  return fireWeatherZone;
 }

 public String getTimeZone() {
  return timeZone;
 }

 public String getRadarStation() {
  return radarStation;
 }

 // Setter Methods 

 public void set @id(String @id) {
  this.@id = @id;
 }

 public void set @type(String @type) {
  this.@type = @type;
 }

 public void setCwa(String cwa) {
  this.cwa = cwa;
 }

 public void setForecastOffice(String forecastOffice) {
  this.forecastOffice = forecastOffice;
 }

 public void setGridId(String gridId) {
  this.gridId = gridId;
 }

 public void setGridX(float gridX) {
  this.gridX = gridX;
 }

 public void setGridY(float gridY) {
  this.gridY = gridY;
 }

 public void setForecast(String forecast) {
  this.forecast = forecast;
 }

 public void setForecastHourly(String forecastHourly) {
  this.forecastHourly = forecastHourly;
 }

 public void setForecastGridData(String forecastGridData) {
  this.forecastGridData = forecastGridData;
 }

 public void setObservationStations(String observationStations) {
  this.observationStations = observationStations;
 }

 public void setRelativeLocation(RelativeLocation relativeLocationObject) {
  this.RelativeLocationObject = relativeLocationObject;
 }

 public void setForecastZone(String forecastZone) {
  this.forecastZone = forecastZone;
 }

 public void setCounty(String county) {
  this.county = county;
 }

 public void setFireWeatherZone(String fireWeatherZone) {
  this.fireWeatherZone = fireWeatherZone;
 }

 public void setTimeZone(String timeZone) {
  this.timeZone = timeZone;
 }

 public void setRadarStation(String radarStation) {
  this.radarStation = radarStation;
 }
}
public class RelativeLocation {
 private String type;
 Geometry GeometryObject;
 Properties PropertiesObject;


 // Getter Methods 

 public String getType() {
  return type;
 }

 public Geometry getGeometry() {
  return GeometryObject;
 }

 public Properties getProperties() {
  return PropertiesObject;
 }

 // Setter Methods 

 public void setType(String type) {
  this.type = type;
 }

 public void setGeometry(Geometry geometryObject) {
  this.GeometryObject = geometryObject;
 }

 public void setProperties(Properties propertiesObject) {
  this.PropertiesObject = propertiesObject;
 }
}
public class Properties {
 private String city;
 private String state;
 Distance DistanceObject;
 Bearing BearingObject;


 // Getter Methods 

 public String getCity() {
  return city;
 }

 public String getState() {
  return state;
 }

 public Distance getDistance() {
  return DistanceObject;
 }

 public Bearing getBearing() {
  return BearingObject;
 }

 // Setter Methods 

 public void setCity(String city) {
  this.city = city;
 }

 public void setState(String state) {
  this.state = state;
 }

 public void setDistance(Distance distanceObject) {
  this.DistanceObject = distanceObject;
 }

 public void setBearing(Bearing bearingObject) {
  this.BearingObject = bearingObject;
 }
}
public class Bearing {
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
public class Distance {
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
public class Geometry {
 private String type;
 ArrayList < Object > coordinates = new ArrayList < Object > ();


 // Getter Methods 

 public String getType() {
  return type;
 }

 // Setter Methods 

 public void setType(String type) {
  this.type = type;
 }
}
public class Geometry {
 private String type;
 ArrayList < Object > coordinates = new ArrayList < Object > ();


 // Getter Methods 

 public String getType() {
  return type;
 }

 // Setter Methods 

 public void setType(String type) {
  this.type = type;
 }
}
