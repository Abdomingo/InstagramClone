package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gjV8oqx50U9jieoHYVrrnQjxEPY7yrbXuKoEvolN")
                .clientKey("oVMjuWKpTHFu0DfAd4e6j8OziufJjzvJDXoNUWkR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
