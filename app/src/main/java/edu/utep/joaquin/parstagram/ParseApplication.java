package edu.utep.joaquin.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        // Initializes Parse SDK as soon as the application is created
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KkpTvGVUKr7KubYXbzeAx7Zo86MMDPO2rUFdETo4")
                .clientKey("RnbYeyQjiXcJvbXNzpTiTudxggCe2oVOEHRrWWpP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

