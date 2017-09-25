package dagger.io.github.dagger2test.di;

import dagger.Module;
import dagger.Provides;
import dagger.io.github.dagger2test.data.Person;
import dagger.io.github.dagger2test.data.User;
import javax.inject.Singleton;

/**
 * Created by zhangman on 2017/9/22 14:25.
 * Email: zhangman523@126.com
 */
@Module public class ApiModule {

  @Provides @Singleton @UserQualifier("realUser") public User provideUser() {
    return new User("user from MainActivityModule");
  }

  @Provides @Singleton @UserQualifier("fakeUser") public User provideFakeUser() {
    return new User("fake user from ApiModule");
  }

  @Provides @Singleton public Person providePerson() {
    return new Person("person from ApiModule");
  }
}
