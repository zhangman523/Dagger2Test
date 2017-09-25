package dagger.io.github.dagger2test.data;

/**
 * Created by zhangman on 2017/9/22 14:26.
 * Email: zhangman523@126.com
 */

public class Person {
  private String mName;

  public Person(String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    mName = name;
  }
}
