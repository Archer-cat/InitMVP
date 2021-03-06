package com.whh.initmvp.utils;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by wuhuihui on 2019/5/17.
 */

public class ContantUtils {

    public static String APPVERSION_BASE_URL = "http://ios.mobile.che-by.com/";
    public static String WEATHER_BASE_URL = "http://t.weather.sojson.com/";
    public static String GITHUBSER_BASE_URL = "https://api.github.com/users/";

    public static CompositeDisposable compositeDisposable;

    /**
     * 新建订阅容器，供APP全局使用
     */
    public static void setCompositeDisposable() {
        compositeDisposable = new CompositeDisposable();
    }

}
