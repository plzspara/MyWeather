package android.myweather.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/*
 *@author panlister
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
