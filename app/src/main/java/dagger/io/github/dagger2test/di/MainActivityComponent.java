package dagger.io.github.dagger2test.di;

import dagger.Component;
import dagger.io.github.dagger2test.MainActivity;

/**
 * Created by zhangman on 2017/9/22 13:50.
 * Email: zhangman523@126.com
 */
@ActivityScope
@Component(modules = { MainActivityModule.class }, dependencies = AppComponent.class)
public interface MainActivityComponent {
  void inject(MainActivity mainActivity);
}
