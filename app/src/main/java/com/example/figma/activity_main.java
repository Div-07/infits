package com.example.figma;

import static com.example.figma.R.layout.fragment_profile;

import android.support.annotation.Nullable;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.harrywhewell.scrolldatepicker.DayScrollDatePicker;
import com.harrywhewell.scrolldatepicker.OnDateSelectedListener;

import java.util.Date;

public class activity_main extends AppCompatActivity {
    String SelectedDate;
    DayScrollDatePicker dayScrollDatePicker;
    public activity_main() {
        super(fragment_profile);
        dayScrollDatePicker = findViewById(R.id.dayDatePicker);
        dayScrollDatePicker.setStartDate(13 , 9 , 2022);
        dayScrollDatePicker.getSelectedDate(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@Nullable @androidx.annotation.Nullable Date date) {
                SelectedDate = date.toString();
                Toast.makeText(activity_main.this , SelectedDate , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
