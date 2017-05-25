package com.galileo.sp1.uiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnItemSelected;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.TBtv)
    TextView ToggleTV;
    @BindView(R.id.SPtv)
    TextView SpinnerTV;
    @BindView(R.id.CBtv)
    TextView CheckBoxTV;
    @BindView(R.id.TPtv)
    TextView TimePickerTV;
    @BindView(R.id.DPtv)
    TextView DatePickerTV;
    @BindView(R.id.spinner)
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
    /**
     * Toggle Button State Listener
     * isChecked is the state of the button
     */
    @OnCheckedChanged(R.id.toggleButton)
    public void OnCheckedChanged(boolean isChecked) {
        if(isChecked){
            // code to execute when the button is clicked to ON
            ToggleTV.setText("The Button is ON");
        }else {
            // code to execute when the button is clicked to OFF
            ToggleTV.setText("The Button is OFF");
        }
    }
    @OnItemSelected(R.id.spinner)
    public void OnItemSelected(int position){
        SpinnerTV.setText("Item selected"+spinner.getItemAtPosition(position));
    }
}
