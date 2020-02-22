package com.example.appquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup weekRg,fingerRg,dayRg;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.button_submit);



        weekRg=findViewById(R.id.radioGroupWeek);
        fingerRg=findViewById(R.id.radioGroupFinger);
        dayRg=findViewById(R.id.radioGroupHours);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(    weekRg.getCheckedRadioButtonId()==R.id.radio_button_7days
            && fingerRg.getCheckedRadioButtonId()==R.id.radio_buttonfinger5
                    && dayRg.getCheckedRadioButtonId()==R.id.radio_button24hours
            )
            {
                Toast.makeText(MainActivity.this, "Congrats!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();

            }
            }
        });




    }
}
