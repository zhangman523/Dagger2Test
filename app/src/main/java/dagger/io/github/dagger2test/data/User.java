package dagger.io.github.dagger2test.data;

/**
 * Created by zhangman on 2017/9/22 13:35.
 * Email: zhangman523@126.com
 */

public class User {
  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
