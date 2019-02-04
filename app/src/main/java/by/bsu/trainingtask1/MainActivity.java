package by.bsu.trainingtask1;
import com.crashlytics.android.Crashlytics;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "277a296a-2807-40d5-8008-67b21f30a986",
                Analytics.class, Crashes.class, Distribute.class);
    }
}
