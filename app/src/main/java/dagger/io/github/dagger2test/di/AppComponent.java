package dagger.io.github.dagger2test.di;

import dagger.Component;
import dagger.io.github.dagger2test.data.Person;
import dagger.io.github.dagger2test.data.User;
import javax.inject.Singleton;

/**
 * Created by zhangman on 2017/9/22 14:32.
 * Email: zhangman523@126.com
 */
@Singleton @Component(modules = { ApiModule.class }) public interface AppComponent {

  @UserQualifier("realUser")
  User getUser();

  @UserQualifier("fakeUser")
  User getFakeUser();

  Person getPerson();
}
