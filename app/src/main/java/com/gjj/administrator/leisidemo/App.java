package com.gjj.administrator.leisidemo;
import org.xutils.x;
import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Application对象是整个应用程序中，所有组件启动之前初始化的一个类对象，Android系统
 * 先启动Application 再去启动Activity
 * Created by Administrator on 16-8-18.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        //创建默认的ImageLoader配置参数
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(this);
        ImageLoader.getInstance().init(configuration);
    }
}
