package com.example.timeforpickerreganovi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showTimePickerDialog(View view) {
        DialogFragment newFragment;
        newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"TimePicker");
    }
    public void processTimePickerResult(int hour, int minute) {
        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string +
                "." + minute_string);
        Toast.makeText(this, "Time: " + timeMessage,
                Toast.LENGTH_SHORT).show();
    }
}