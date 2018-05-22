package com.project.avans.mdodandroid;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    private Button registerButton;
    private Button datePickerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerButton = findViewById(R.id.activityRegister_buttonCreateAccount);
        datePickerButton = findViewById(R.id.activityRegister_buttonDateOfBirth);

        registerButton.setOnClickListener(this);
        datePickerButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activityRegister_buttonDateOfBirth:
                Log.i("RegisterActivity", "onClick of datePickerButton called");

                DatePickerDialog dialog = new DatePickerDialog(this, this, 2018, 0, 1);
                dialog.show();

                break;

            case R.id.activityRegister_buttonCreateAccount:
                Log.i("RegisterActivity", "onClick of registerButton called");

                //TODO: Create intent to dashboard with new account

                //TODO: Pass data through API and check if data is correct
                break;
        }
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month = month + 1;
        Log.i("RegisterActivity", "onDateSet called, date: " + dayOfMonth + "/" + month + "/" + year);
        datePickerButton.setText(dayOfMonth + "/" + month + "/" + year);

        //TODO: Pass date of birth through with the rest, and possibly add a check for invalid dates (like in the future)
    }
}
