package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2018/3/20.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Updata updata;

    public class Updata{

        @SerializedName("loc")
        public String updateTime;
    }
}
