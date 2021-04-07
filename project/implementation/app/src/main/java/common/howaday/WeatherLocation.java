package common.howaday;

import android.app.Activity;
import android.content.SharedPreferences;
 
public class WeatherLocation {
     
    SharedPreferences prefs;
     
    public WeatherLocation(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }
     

    public String getCity(){

        return prefs.getString("city", "MALAKAND, PK");
    }
     
    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
     
}