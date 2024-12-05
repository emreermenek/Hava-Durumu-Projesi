
import java.sql.*;
import java.util.ArrayList;
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
public class Database {
    private String kullaniciAdi = "root";
    private String parola = "";

    private String db_ismi = "weather";
    //databasein adresini vermemiz gerekir uzak bir sunucuysa adresi lokalse asagidaki gibi:
    private String host = "localhost";

    private int port = 3306;

    private Connection conn = null;

    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    public Database(){
//        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        //kodu guvenceye almak icin: turkce karakter gonderince
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+"?useUnicode=true&characterEncoding=UTF-8";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi!");
        }

        try {
            conn = DriverManager.getConnection(url, kullaniciAdi, parola);
        } catch (SQLException e) {
            System.out.println("Baglanti basarisiz!");
        }
        System.out.println("Baglanti basarili.");
    }
    
    
    public void addInformation(WeatherData data) {
           
        try { 
            String sorguDays = "Insert Into days (date) VALUES(?)"; //date
            String sorguDayData = "Insert Into day_data (date, maxTemp, minTemp, avgTemp, avgHumidity,maxWindSpeed,avgVis,willItRain,willItSnow,sunrise,sunset,lastUpdated,currTemp,currState,currWind,currHumidity,currFeeledTemp,currUV) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(sorguDays);
            preparedStatement.setString(1, data.getDate());
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement(sorguDayData);
            preparedStatement.setString(1, data.getDate());
            preparedStatement.setDouble(2, data.getMaxTemp());
            preparedStatement.setDouble(3, data.getMinTemp());
            preparedStatement.setDouble(4,data.getAvgTemp());
            preparedStatement.setDouble(5, data.getAvgHumidity());
            preparedStatement.setDouble(6, data.getMaxWindSpeed());
            preparedStatement.setDouble(7, data.getAvgVis());
            preparedStatement.setDouble(8, data.getWillItRain());
            preparedStatement.setDouble(9, data.getWillItSnow());
            preparedStatement.setString(10, data.getSunrise());
            preparedStatement.setString(11, data.getSunset());
            preparedStatement.setString(12, data.getLastUpdate());
            preparedStatement.setDouble(13, data.getCurrTemp());
            preparedStatement.setString(14, data.getCurrState());
            preparedStatement.setDouble(15, data.getCurrWind());
            preparedStatement.setDouble(16, data.getCurrHumidity());
            preparedStatement.setDouble(17, data.getCurrFeeledTemp());
            preparedStatement.setDouble(18, data.getCurrUV());
            preparedStatement.executeUpdate();
            conn.commit();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<WeatherData> getAllData(){
        try {
            ArrayList<WeatherData> datas = new ArrayList<>();
            String sorgu = "Select * From day_data";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next()){
                String date = rs.getString("date");
                double maxTemp = rs.getDouble("maxTemp");
                double minTemp = rs.getDouble("minTemp");
                double avgTemp = rs.getDouble("avgTemp");
                double avgHumidity = rs.getDouble("avgHumidity");
                double maxWindSpeed = rs.getDouble("maxWindSpeed");
                double avgvis = rs.getDouble("avgvis");
                double willItRain = rs.getDouble("willItRain");
                double willItSnow = rs.getDouble("willItSnow");
                String sunrise = rs.getString("sunrise");
                String sunset = rs.getString("sunset");
                String lastUpdated = rs.getString("lastUpdated");
                double currTemp = rs.getDouble("currTemp");
                String currState = rs.getString("currState");
                double currWind = rs.getDouble("currWind");
                double currHumidity = rs.getDouble("currHumidity");
                double currFeeledTemp = rs.getDouble("currFeeledTemp");
                double currUV = rs.getDouble("currUV");
                datas.add(new WeatherData(date, maxTemp, minTemp, avgTemp, avgHumidity, maxWindSpeed, avgvis, willItRain, willItSnow, sunrise, sunset, lastUpdated, currTemp, currState, currWind, currHumidity, currFeeledTemp, currUV));
            }     
            return datas;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<String> getDateData(){
      
        try {
            String sorgu = "Select date From days";
            ArrayList<String> dates = new ArrayList<>();
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next()){
                String date = rs.getString("date");
                dates.add(date);
            }
            
            return dates;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void updateData(WeatherData data){
        
        try {
            String sorgu = "Update day_data set maxTemp = ?, minTemp = ?, avgTemp = ?, avgHumidity = ?, maxWindSpeed = ?, avgVis = ?, willItRain = ?, willItSnow = ?, sunrise = ? sunset = ?, lastUpdated = ?, currTemp = ?, currState = ?, currWind = ?, currHumidity = ?, currFeeledTemp = ?, currUV = ? where date = ?";
            preparedStatement = conn.prepareStatement(sorgu);             
            preparedStatement.setDouble(1, data.getMaxTemp());
            preparedStatement.setDouble(2, data.getMinTemp());
            preparedStatement.setDouble(3,data.getAvgTemp());
            preparedStatement.setDouble(4, data.getAvgHumidity());
            preparedStatement.setDouble(5, data.getMaxWindSpeed());
            preparedStatement.setDouble(6, data.getAvgVis());
            preparedStatement.setDouble(7, data.getWillItRain());
            preparedStatement.setDouble(8, data.getWillItSnow());
            preparedStatement.setString(9, data.getSunrise());
            preparedStatement.setString(10, data.getSunset());
            preparedStatement.setString(11, data.getLastUpdate());
            preparedStatement.setDouble(12, data.getCurrTemp());
            preparedStatement.setString(13, data.getCurrState());
            preparedStatement.setDouble(14, data.getCurrWind());
            preparedStatement.setDouble(15, data.getCurrHumidity());
            preparedStatement.setDouble(16, data.getCurrFeeledTemp());
            preparedStatement.setDouble(17, data.getCurrUV());
            preparedStatement.setString(18, data.getDate());
            //preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public WeatherData getDataAtSpecifiedDate(String date){
       
        try {
            String sorgu = "Select * From day_data where date = ?";
            preparedStatement = conn.prepareStatement(sorgu);
            preparedStatement.setString(1, date);
            ResultSet rs = preparedStatement.executeQuery();
             if (rs.next()) {
            String dateC = rs.getString("date");
            double maxTemp = rs.getDouble("maxTemp");
            double minTemp = rs.getDouble("minTemp");
            double avgTemp = rs.getDouble("avgTemp");
            double avgHumidity = rs.getDouble("avgHumidity");
            double maxWindSpeed = rs.getDouble("maxWindSpeed");
            double avgvis = rs.getDouble("avgvis");
            double willItRain = rs.getDouble("willItRain");
            double willItSnow = rs.getDouble("willItSnow");
            String sunrise = rs.getString("sunrise");
            String sunset = rs.getString("sunset");
            String lastUpdated = rs.getString("lastUpdated");
            double currTemp = rs.getDouble("currTemp");
            String currState = rs.getString("currState");
            double currWind = rs.getDouble("currWind");
            double currHumidity = rs.getDouble("currHumidity");
            double currFeeledTemp = rs.getDouble("currFeeledTemp");
            double currUV = rs.getDouble("currUV");

            return new WeatherData(
                dateC, maxTemp, minTemp, avgTemp, avgHumidity, maxWindSpeed,
                avgvis, willItRain, willItSnow, sunrise, sunset, lastUpdated,
                currTemp, currState, currWind, currHumidity, currFeeledTemp, currUV
            );
        } else {
            return null;
        }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
