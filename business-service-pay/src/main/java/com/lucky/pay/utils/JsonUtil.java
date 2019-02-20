package com.lucky.pay.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * json工具类
 *
 * @author Waldron Ye
 * @date 2019/2/20 23:20
 */
public class JsonUtil {
    public static Gson gson = new Gson();


    /**
     * json字符串转换对象
     *
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T jsonStrToObj(String json, Class<T> cls) {

        T t = null;
        try {
            t = gson.fromJson(json, cls);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }

        return t;
    }


    /**
     * 转换json格式字符串
     *
     * @param obj
     * @return
     */
    public static String objToJsonStr(Object obj) {
        String json = gson.toJson(obj);
        return json;
    }
}
