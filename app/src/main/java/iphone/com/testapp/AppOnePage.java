package iphone.com.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by xzw12 on  0018.
 */
public class AppOnePage extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.content_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.titlebar);
    }
}
