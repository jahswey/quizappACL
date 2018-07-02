package com.example.jahswey.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //This method is called when the Submit button is clicked
    public void submitQuestions(View view){
        int question1 = q1();
        int question2 = q2();



        //Question3
        CheckBox editSoftware = findViewById(R.id.photoshop);
        boolean software = editSoftware.isChecked();
        if(software){
            score = score + 2;
        }

        //question 4
        boolean checked = ((RadioButton) view).isSelected();

        if (checked){
            score = score + 2;
        }


        //Question5
        CheckBox format1 = findViewById(R.id.png);
        boolean pngformat = format1.isChecked();
        if(pngformat){
            score = score + 1;
        }
        CheckBox format2 = findViewById(R.id.jpg);
        boolean jpgformat = format2.isChecked();
        if(jpgformat) {
            score = score + 1;
        }


        Toast.makeText(this, "Total Score is "+ score +"/10", Toast.LENGTH_SHORT).show();



    }
    //question 1
    private int q1(){
        EditText editText = (EditText) findViewById(R.id.question1);
        String question1 = editText.getText().toString();
        if(question1.equalsIgnoreCase("camera")){
            score = score + 2;
        }else { score = score + 0;}
        return score;

    }
    //question 2
    private int q2(){
        EditText editText = (EditText) findViewById(R.id.question2);
        String question2 = editText.getText().toString();
        if(question2.matches("")){
            score = score + 0;
        }else { score = score + 2;}
        return score;

    }

    //Question 4
//    public void onRadioClick(View view) {
//        // check if the button is checked
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.yes:
//                if (checked)
//                    score = score + 2;
//                break;
//            case R.id.no:
//                if (checked)
//                    score = score + 2;
//                break;
//        }
//    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.question_scores);
        orderSummaryTextView.setText(message);
    }

   
}
