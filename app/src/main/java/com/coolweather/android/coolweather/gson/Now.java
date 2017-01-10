package com.coolweather.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/1/7.
 */

public class Now {
    @SerializedName("tem")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
