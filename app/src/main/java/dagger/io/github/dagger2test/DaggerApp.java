package dagger.io.github.dagger2test;

import android.app.Application;
import dagger.io.github.dagger2test.di.ApiModule;
import dagger.io.github.dagger2test.di.AppComponent;
import dagger.io.github.dagger2test.di.DaggerAppComponent;

/**
 * Created by zhangman on 2017/9/22 11:08.
 * Email: zhangman523@126.com
 */

public class DaggerApp extends Application {

  AppComponent mAppComponent;

  @Override public void onCreate() {
    super.onCreate();
    mAppComponent = DaggerAppComponent.builder().apiModule(new ApiModule()).build();
  }

  public AppComponent getAppComponent() {
    return mAppComponent;
  }
}
