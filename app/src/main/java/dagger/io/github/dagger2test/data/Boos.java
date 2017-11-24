package dagger.io.github.dagger2test.data;

import javax.inject.Inject;

/**
 * Created by zhangman on 2017/11/24 16:31.
 * Email: zhangman523@126.com
 */

public class Boos {
  public String money;
  public User mUser;

  @Inject
  public Boos(User user) {
    mUser = user;
  }
}
