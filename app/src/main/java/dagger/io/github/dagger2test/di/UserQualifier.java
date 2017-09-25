package dagger.io.github.dagger2test.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/**
 * Created by zhangman on 2017/9/25 09:29.
 * Email: zhangman523@126.com
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UserQualifier {
  String value() default "";
}
