package com.hotstrip.dubbo.api.util;

import com.google.gson.Gson;

public class GsonUtil {

    // class to String
    public static String classToString(final Object o) {
        return new Gson().toJson(o);
    }
}
