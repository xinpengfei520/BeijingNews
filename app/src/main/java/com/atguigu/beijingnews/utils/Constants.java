package com.atguigu.beijingnews.utils;

/**
 * Created by xinpengfei on 2016/10/17.
 * 微信:18091383534
 * Function :联网请求的配置常量地址
 */

public class Constants {

    /**
     * 请求网络的公共连接地址
     */
//    public static final String BASE_URL = "http://192.168.1.25:8080/web_home";
        public static final String BASE_URL = "http://10.0.2.2:8080/web_home";
//    public static final String BASE_URL = "http://192.168.191.1:8080/web_home";

    /**
     * 新闻中心请求地址
     */
    public static final String NEWS_CENTER_URL = BASE_URL + "/static/api/news/categories.json";
}