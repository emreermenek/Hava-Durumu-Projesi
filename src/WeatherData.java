/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emree
 */
public class WeatherData {
    private String date;
    private double maxTemp;
    private double minTemp;
    private double avgTemp;
    private double avgHumidity;
    private double maxWindSpeed;
    private double avgVis;
    private double willItRain;
    private double willItSnow;
    private String sunrise;
    private String sunset;
    private String lastUpdate;
    private double currTemp;
    private String currState;
    private double currWind;
    private double currHumidity;
    private double currFeeledTemp;
    private double currUV;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgHumidity() {
        return avgHumidity;
    }

    public void setAvgHumidity(double avgHumidity) {
        this.avgHumidity = avgHumidity;
    }

    public double getMaxWindSpeed() {
        return maxWindSpeed;
    }

    public void setMaxWindSpeed(double maxWindSpeed) {
        this.maxWindSpeed = maxWindSpeed;
    }

    public double getAvgVis() {
        return avgVis;
    }

    public void setAvgVis(double avgVis) {
        this.avgVis = avgVis;
    }

    public double getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(double willItRain) {
        this.willItRain = willItRain;
    }

    public double getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(double willItSnow) {
        this.willItSnow = willItSnow;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public double getCurrTemp() {
        return currTemp;
    }

    public void setCurrTemp(double currTemp) {
        this.currTemp = currTemp;
    }

    public String getCurrState() {
        return currState;
    }

    public void setCurrState(String currState) {
        this.currState = currState;
    }

    public double getCurrWind() {
        return currWind;
    }

    public void setCurrWind(double currWind) {
        this.currWind = currWind;
    }

    public double getCurrHumidity() {
        return currHumidity;
    }

    public void setCurrHumidity(double currHumidity) {
        this.currHumidity = currHumidity;
    }

    public double getCurrFeeledTemp() {
        return currFeeledTemp;
    }

    public void setCurrFeeledTemp(double currFeeledTemp) {
        this.currFeeledTemp = currFeeledTemp;
    }

    public double getCurrUV() {
        return currUV;
    }

    public void setCurrUV(double currUV) {
        this.currUV = currUV;
    }
   

    public WeatherData(String date, double maxTemp, double minTemp, double avgTemp, double avgHumidity, double maxWindSpeed, double avgVis, double willItRain, double willItSnow, String sunrise, String sunset, String lastUpdate, double currTemp, String currState, double currWind, double currHumidity, double currFeeledTemp, double currUV) {
        this.date = date;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.avgTemp = avgTemp;
        this.avgHumidity = avgHumidity;
        this.maxWindSpeed = maxWindSpeed;
        this.avgVis = avgVis;
        this.willItRain = willItRain;
        this.willItSnow = willItSnow;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.lastUpdate = lastUpdate;
        this.currTemp = currTemp;
        this.currState = currState;
        this.currWind = currWind;
        this.currHumidity = currHumidity;
        this.currFeeledTemp = currFeeledTemp;
        this.currUV = currUV;
    }
 
    
}
