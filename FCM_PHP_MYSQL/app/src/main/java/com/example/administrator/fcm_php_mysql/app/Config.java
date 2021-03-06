package com.example.administrator.fcm_php_mysql.app;

/**
 * Created by Administrator on 11/9/2016.
 */

public class Config {

    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";

    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";

    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;

    public static final String SHARED_PREF = "ah_firebase";
    public static final String URL = "http://192.168.137.1/mchat/register.php";
    public static final String URL_LOGIN = "login";
    public static final String URL_REGISTER = "http://192.168.137.1/mchat/register.php";
}