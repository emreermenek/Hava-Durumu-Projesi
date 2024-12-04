
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emree
 */
public class Weather {
    private static final String API_KEY = "e2a9ace1be1d43fcb46123914240412";
    private static final String name = "İzmir"; //lat=38.4224548, lon=27.1310699
    private static final double id = 311044;
    private static final String country = "TR";
    private static final double lat = 38.4224548; 
    private static final double lon = 27.1310699;
    private static final String urlAdress = "http://api.weatherapi.com/v1/forecast.json?key="+API_KEY+"&q=38.4224548,27.1310699&days=7";
    Database database = new Database();
    

    
   
    public static Map<String, Object> jsonToMap(String str) {
        return new Gson().fromJson(str, new TypeToken<Map<String, Object>>() {}.getType());
    }
    
    public static void jsonCreator(Map<String, Object> response){
            try (FileWriter fileWriter = new FileWriter("weather.json")) {
                Gson gson = new Gson();
                String formattedJson = gson.toJson(response);
                fileWriter.write(formattedJson);
                System.out.println("JSON verisi 'weather.json' dosyasına kaydedildi!");
            } catch (IOException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void parseInfo(){
        Weather weather = new Weather();
         try {
             StringBuilder builder = new StringBuilder();
             URL url = new URL(urlAdress);
             URLConnection conn = url.openConnection();
             BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
             String line;
             while((line = reader.readLine()) != null){
                 builder.append(line);
             }
             reader.close();
            Map<String, Object> response = jsonToMap(builder.toString());
            
         
            //double temp = jsonObject.get("forecast").getAsJsonObject().get("forecastday").getAsJsonObject().get("0").getAsJsonObject().get("day").getAsJsonObject().get("avgtemp_c");
            
            JsonObject root = JsonParser.parseString(builder.toString()).getAsJsonObject();
            weather.processData(root);

            //forecast > forecastday > [0] > day > avgtemp_c
            

            

            
            //double avgTempC = day.get("avgtemp_c").getAsDouble();
            //System.out.println("Ortalama Sıcaklık (°C): " + avgTempC);
            
            // JSON'u düzgün formatta dosyaya kaydetme tree yapısında görebilmek için
            //jsonCreator(response);
         } catch (MalformedURLException ex) {
             Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    public void processData(JsonObject root){
        
        JsonArray forecastdayArray = root.getAsJsonObject("forecast").getAsJsonArray("forecastday");
        for(JsonElement day : forecastdayArray){
            String date = day.getAsJsonObject().get("date").getAsString();
            JsonObject weatherInfo = day.getAsJsonObject().get("day").getAsJsonObject(); //bunu almayacagiz.
            //Celcius Degree:
            double maxTemp = weatherInfo.get("maxtemp_c").getAsDouble();
            double minTemp = weatherInfo.get("mintemp_c").getAsDouble();
            double avgTemp = weatherInfo.get("avgtemp_c").getAsDouble();
            //nem - humidity
            double avgHumidity = weatherInfo.get("avghumidity").getAsDouble();
            double maxWindSpeed = weatherInfo.get("maxwind_kph").getAsDouble(); //km
            //ortalama gorus mesafesi - km cinsinden
            double avgvis = weatherInfo.get("avgvis_km").getAsDouble();
            //yagmur yagma olasiligi / kar yagma olasiligi
            double willItRain = weatherInfo.get("daily_will_it_rain").getAsDouble();
            double willItSnow = weatherInfo.get("daily_will_it_snow").getAsDouble();
            //gundogumu / gunbatımı
            String sunrise = day.getAsJsonObject().get("astro").getAsJsonObject().get("sunrise").getAsString();
            String sunset = day.getAsJsonObject().get("astro").getAsJsonObject().get("sunset").getAsString();
            //current -> anlık
            String lastUpdatedDate = root.get("current").getAsJsonObject().get("last_updated").getAsString();
            double currTemp = root.get("current").getAsJsonObject().get("temp_c").getAsDouble();
            String currState = root.get("current").getAsJsonObject().get("condition").getAsJsonObject().get("text").getAsString();
            double currWind = root.get("current").getAsJsonObject().get("wind_kph").getAsDouble();
            double currHumidity = root.get("current").getAsJsonObject().get("humidity").getAsDouble();
            double currFeeledTemp = root.get("current").getAsJsonObject().get("feelslike_c").getAsDouble();
            double currUV = root.get("current").getAsJsonObject().get("uv").getAsDouble();
            database.addInformation(new WeatherData(date, maxTemp, minTemp, avgTemp, avgHumidity, maxWindSpeed, avgvis, willItRain, willItSnow, sunrise, sunset, lastUpdatedDate, currTemp, currState, currWind, currHumidity, currFeeledTemp, currUV));
        }
    }
    
    public static void main(String[] args){
        parseInfo();
    }

    
}
