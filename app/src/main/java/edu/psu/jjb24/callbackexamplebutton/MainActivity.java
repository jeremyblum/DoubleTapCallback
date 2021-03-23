package edu.psu.jjb24.callbackexamplebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        DoubleTapButton button = (DoubleTapButton) view;
        Log.d("CallbackExView", "Click detected on '" + button.getText().toString() + "'");
    }
}