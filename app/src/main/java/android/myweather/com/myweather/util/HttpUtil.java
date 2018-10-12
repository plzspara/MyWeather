package android.myweather.com.myweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/*
 *@author panlister
 */
public class HttpUtil {
    public static void senOkhttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
