package com.example.hellorobo;

import android.app.Application;
import androidx.test.core.app.ApplicationProvider;
import com.google.common.truth.Truth;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(RobolectricTestRunner.class)
public class RoboTest {

  @Test
  public void addition_isCorrect() {
    Truth.assertThat(ApplicationProvider.<Application>getApplicationContext().getPackageName()).isEqualTo("com.example.hellorobo");

  }
}