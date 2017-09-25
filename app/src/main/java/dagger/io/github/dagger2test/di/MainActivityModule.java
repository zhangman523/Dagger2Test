package dagger.io.github.dagger2test.di;

import dagger.Module;
import dagger.Provides;
import dagger.io.github.dagger2test.MainActivity;
import dagger.io.github.dagger2test.data.User;

/**
 * Created by zhangman on 2017/9/22 11:20.
 * Email: zhangman523@126.com
 */
@Module public class MainActivityModule {
  private MainActivity mMainActivity;

  public MainActivityModule(MainActivity mainActivity) {
    mMainActivity = mainActivity;
  }

  @Provides public MainActivity provideActivity() {
    return mMainActivity;
  }

}
