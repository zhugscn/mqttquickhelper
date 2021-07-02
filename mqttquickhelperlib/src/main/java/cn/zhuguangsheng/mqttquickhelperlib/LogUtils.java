package cn.zhuguangsheng.mqttquickhelperlib;

import android.util.Log;

public class LogUtils {
    public static final String TAG = LogUtils.class.getSimpleName();

    public static void logi(String msg){
        Log.i(TAG, msg);
    }
}
