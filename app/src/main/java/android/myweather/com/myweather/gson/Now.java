package android.myweather.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/*
 *@author panlister
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
