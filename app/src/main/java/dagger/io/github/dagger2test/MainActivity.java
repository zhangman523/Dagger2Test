package dagger.io.github.dagger2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import dagger.io.github.dagger2test.data.Person;
import dagger.io.github.dagger2test.data.User;
import dagger.io.github.dagger2test.di.DaggerMainActivityComponent;
import dagger.io.github.dagger2test.di.UserQualifier;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject @UserQualifier("realUser") User mUser;
  @Inject @UserQualifier("fakeUser") User mFakeUser;
  @Inject Person mPerson;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    DaggerMainActivityComponent.builder()
        .appComponent(((DaggerApp) getApplication()).getAppComponent())
        .build()
        .inject(this);
    ((TextView) findViewById(R.id.use_name_label)).setText(
        mUser.getName() + "," + mPerson.getName() + "," + mFakeUser.getName());
  }
}
