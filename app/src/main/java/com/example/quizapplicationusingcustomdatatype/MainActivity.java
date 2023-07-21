package com.example.quizapplicationusingcustomdatatype;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText et;
    TextView txt;
    String ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        et=findViewById(R.id.editTextText);
        txt=findViewById(R.id.textView);
        custom[]d=new custom[5];
        d[0]=new custom("What is the currency of India","rupee");
        d[1]=new custom("What is the capital of Pakistan","islamabad");
        d[2]=new custom("What is the captial of India","delhi");
        d[3]=new custom("What is the captial of Nepal","Kathmandu");
        d[4]=new custom("What is the currency of USA","dollar");
        Random randomNumber=new Random();
        int numberGenerated = randomNumber.nextInt(5);
        txt.setText(d[numberGenerated].quizquestion);
         ans=d[numberGenerated].quizans;
        btn.setOnClickListener(view ->{
            if(et.getText().toString().toLowerCase().equals(ans))
            {
                int numberGenerated1;
                numberGenerated1=randomNumber.nextInt(5);
                txt.setText(d[numberGenerated1].quizquestion);
                ans=d[numberGenerated1].quizans;
                Toast.makeText(MainActivity.this,"Correct! Answer!!",
                        Toast.LENGTH_LONG).show();
                et.setText("");

            }
        });

    }
}