package com.gjj.administrator.leisidemo.http;

import org.xutils.common.Callback.Cancelable;
import org.xutils.common.Callback.CommonCallback;
import org.xutils.http.RequestParams;
import org.xutils.x;
import java.util.Map;

/**
 * Created by m on 2016/8/18.
 */
public class HttpUtils {
    /**
     * 普通get请求，回调返回字符串
     */
    public static Cancelable get(String url, CommonCallback<?> response) {
        RequestParams params = new RequestParams(url);
        return get(params, response);
    }
    /**
     * 带有参数的普通get请求，回调返回字符串
     */
    public static Cancelable get(String url, final Map<String, String> contentParams, CommonCallback<?> response) {
        RequestParams params = new RequestParams(url);
        for (Map.Entry<String, String> entry : contentParams.entrySet()) {
            params.addBodyParameter(entry.getKey(), entry.getValue());
        }
        return get(params, response);
    }

    /**
     * 带有参数的普通get请求，回调返回字符串
     */
    public static Cancelable get(RequestParams params, CommonCallback<?> response) {
        return x.http().get(params, response);
    }


    /**
     * 普通post请求，回调返回字符串
     */
    public static Cancelable post(String url, CommonCallback<?> response) {
        RequestParams params = new RequestParams(url);
        return post(params, response);
    }

    /**
     * 带有参数post请求，回调返回字符串
     */
    public static Cancelable post(String url, final Map<String, String> contentParams, CommonCallback<?> response) {
        RequestParams params = new RequestParams(url);
        for (Map.Entry<String, String> entry : contentParams.entrySet()) {
            params.addBodyParameter(entry.getKey(), entry.getValue());
        }
        return post(params, response);
    }

    /**
     * 带有参数post请求，回调返回字符串
     */
    public static Cancelable post(RequestParams params, CommonCallback<?> response) {
        return x.http().post(params, response);
    }
}
