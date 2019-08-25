package net.kathir.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleViewActivity extends AppCompatActivity {

    private static final String TAG = LifeCycleViewActivity.class.getSimpleName();

    TextView lifeCycleStatus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle_main);

        lifeCycleStatus = (TextView)findViewById(R.id.lifecyle_statusView);

        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Owner onStart");
        lifeCycleStatus.setText("onStart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Owner onPause");
        lifeCycleStatus.setText("onPause Called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Owner onResume");
        lifeCycleStatus.setText("onResume Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Owner onStop");
        lifeCycleStatus.setText("onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Owner onDestroy");
        lifeCycleStatus.setText("onDestroy Called");

    }
}
