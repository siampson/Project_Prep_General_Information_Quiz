package com.intcomnet.myquizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    int score = 0 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void results (View view) {

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.answer_group_1);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.answer_group_4) ;

        RadioButton answer1_Question1 = (RadioButton) findViewById(R.id.answer_1_question_1);
        RadioButton answer2_Question1 = (RadioButton) findViewById(R.id.answer_2_question_1);
        RadioButton answer3_Question1 = (RadioButton) findViewById(R.id.answer_3_question_1);
        RadioButton answer4_Question1 = (RadioButton) findViewById(R.id.answer_4_question_1);

        RadioButton answer1_Question4 = (RadioButton) findViewById(R.id.answer_1_question_4) ;
        RadioButton answer2_Question4 = (RadioButton) findViewById(R.id.answer_2_question_4) ;
        RadioButton answer3_Question4 = (RadioButton) findViewById(R.id.answer_3_question_4) ;
        RadioButton answer4_Question4 = (RadioButton) findViewById(R.id.answer_4_question_4) ;

        EditText answer1_Question2_TextView = (EditText) findViewById(R.id.answer_1_question_2) ;
        String  answer1_Question2 = answer1_Question2_TextView.getText().toString();

        TextView correctAnswer2TextView = (TextView) findViewById(R.id.correct_answer_question_2);

        EditText answer1_Question5_TextView = (EditText) findViewById(R.id.answer_1_question_5) ;
        String  answer1_Question5 = answer1_Question5_TextView.getText().toString();
        TextView correctAnswer5TextView = (TextView) findViewById(R.id.correct_answer_question_5);

        CheckBox answer1_Question3 = (CheckBox) findViewById(R.id.answer_1_question_3);
        CheckBox answer2_Question3 = (CheckBox) findViewById(R.id.answer_2_question_3);
        CheckBox answer3_Question3 = (CheckBox) findViewById(R.id.answer_3_question_3);
        CheckBox answer4_Question3 = (CheckBox) findViewById(R.id.answer_4_question_3);
        CheckBox answer5_Question3 = (CheckBox) findViewById(R.id.answer_5_question_3);

        boolean answer11 = answer1_Question1.isChecked();
        boolean answer21 = answer2_Question1.isChecked();
        boolean answer31 = answer3_Question1.isChecked();
        boolean answer41 = answer4_Question1.isChecked();

        boolean answer14 = answer1_Question4.isChecked();
        boolean answer24 = answer2_Question4.isChecked();
        boolean answer34 = answer3_Question4.isChecked();
        boolean answer44 = answer4_Question4.isChecked();

        boolean answer13 = answer1_Question3.isChecked();
        boolean answer23 = answer2_Question3.isChecked();
        boolean answer33 = answer3_Question3.isChecked();
        boolean answer43 = answer4_Question3.isChecked();
        boolean answer53 = answer5_Question3.isChecked();

        EditText name = (EditText) findViewById(R.id.name) ;
        String nameEntered = name.getText().toString();

        Button reset = (Button) findViewById(R.id.reset_button);

        answer1 (answer11, answer21, answer31, answer41);
        answer2 (answer1_Question2);
        answer3 (answer13, answer23, answer33, answer43, answer53);
        answer4 (answer14, answer24, answer34, answer44);
        answer5 (answer1_Question5);

        answer1_Question3.setBackgroundColor(Color.GREEN);
        answer2_Question3.setBackgroundColor(Color.GREEN);
        answer3_Question3.setBackgroundColor(Color.GREEN);
        answer4_Question3.setBackgroundColor(Color.GREEN);
        answer5_Question3.setBackgroundColor(Color.GREEN);
//        answer1_Question4.setBackgroundColor(Color.GREEN);


        if (reset.getText().toString().equals("reset")){
            /**resets the first question*/
            radioGroup1.clearCheck();
            answer1_Question1.setBackgroundColor(Color.TRANSPARENT);
            answer2_Question1.setBackgroundColor(Color.TRANSPARENT);
            answer3_Question1.setBackgroundColor(Color.TRANSPARENT);
            answer4_Question1.setBackgroundColor(Color.TRANSPARENT);
            answer4_Question1.setBackgroundColor(Color.TRANSPARENT);

            /**reset the second question*/
            answer1_Question2_TextView.setBackgroundColor(Color.TRANSPARENT);
            answer1_Question2_TextView.setText("");
            correctAnswer2TextView.setText("");
            correctAnswer2TextView.setBackgroundColor(Color.TRANSPARENT);

            /**reset the third questios */
            answer1_Question3.setChecked(false);
            answer1_Question3.setBackgroundColor(Color.TRANSPARENT);
            answer2_Question3.setChecked(false);
            answer2_Question3.setBackgroundColor(Color.TRANSPARENT);
            answer3_Question3.setChecked(false);
            answer3_Question3.setBackgroundColor(Color.TRANSPARENT);
            answer4_Question3.setChecked(false);
            answer4_Question3.setBackgroundColor(Color.TRANSPARENT);
            answer5_Question3.setChecked(false);
            answer5_Question3.setBackgroundColor(Color.TRANSPARENT);

            /**resets the fourth question*/
            radioGroup2.clearCheck();
            answer1_Question4.setBackgroundColor(Color.TRANSPARENT);
            answer2_Question4.setBackgroundColor(Color.TRANSPARENT);
            answer3_Question4.setBackgroundColor(Color.TRANSPARENT);
            answer4_Question4.setBackgroundColor(Color.TRANSPARENT);

            /**resets the fifth question*/
            answer1_Question5_TextView.setBackgroundColor(Color.TRANSPARENT);
            answer1_Question5_TextView.setText("");
            correctAnswer5TextView.setText("");
            correctAnswer5TextView.setBackgroundColor(Color.TRANSPARENT);

            /**resets the name*/
            name.setText("");

            /**resets scores*/
            score = 0;

            /**ser reset button back to results*/
            reset.setText("Results");
        }
        else {
            reset.setText("reset");
            Toast.makeText(this, nameEntered + ", " + "Your score is " + score + " out of 5", Toast.LENGTH_SHORT).show();

        }

    }

    public void answer1 (boolean answer1, boolean answer2, boolean answer3, boolean answer4) {
        RadioButton answer1_Question1 = (RadioButton) findViewById(R.id.answer_1_question_1);
        RadioButton answer2_Question1 = (RadioButton) findViewById(R.id.answer_2_question_1);
        RadioButton answer3_Question1 = (RadioButton) findViewById(R.id.answer_3_question_1);
        RadioButton answer4_Question1 = (RadioButton) findViewById(R.id.answer_4_question_1);
        if (!answer1 && answer2 && !answer3 && !answer4) {
            score += 1;
        }
        else if (answer1)answer1_Question1.setBackgroundColor(Color.RED);
        else if (answer3)answer3_Question1.setBackgroundColor(Color.RED);
        else if (answer4) answer4_Question1.setBackgroundColor(Color.RED);

        answer2_Question1.setBackgroundColor(Color.GREEN);

    }

    public void answer2 (String answer1) {
        TextView answer12 = (TextView) findViewById(R.id.answer_1_question_2);
        if (answer1.equals("Africa")){
            score += 1;
            answer12.setBackgroundColor(Color.GREEN);

        }
         else {

            answer12.setBackgroundColor(Color.RED);
            TextView correctAnswer = (TextView) findViewById(R.id.correct_answer_question_2);
            correctAnswer.setText("Africa");
            correctAnswer.setBackgroundColor(Color.GREEN);
        }

    }
    public void answer3 (boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5) {
        if (answer1 && answer2 && answer3 && answer4 && answer5)
            score+=1;
    }
    public void answer4 (boolean answer1, boolean answer2, boolean answer3, boolean answer4) {
        RadioButton answer1_Question4 = (RadioButton) findViewById(R.id.answer_1_question_4) ;
        RadioButton answer2_Question4 = (RadioButton) findViewById(R.id.answer_2_question_4) ;
        RadioButton answer3_Question4 = (RadioButton) findViewById(R.id.answer_3_question_4) ;
        RadioButton answer4_Question4 = (RadioButton) findViewById(R.id.answer_4_question_4) ;
        if (answer1 && !answer2 && !answer3 && !answer4) {
            score += 1;
        }
        else if (answer2) answer2_Question4.setBackgroundColor(Color.RED);
        else if (answer3) answer3_Question4.setBackgroundColor(Color.RED);
        else if (answer4) answer4_Question4.setBackgroundColor(Color.RED);

        answer1_Question4.setBackgroundColor(Color.GREEN);

    }
    public void  answer5 (String answer1){
        TextView answer15 = (TextView) findViewById(R.id.answer_1_question_5);
        if (answer1.equals("1992")) {
            score += 1;
            answer15.setBackgroundColor(Color.GREEN);
        }
        else {

            answer15.setBackgroundColor(Color.RED);
            TextView correctAnswer = (TextView) findViewById(R.id.correct_answer_question_5);
            correctAnswer.setText("1992");
            correctAnswer.setBackgroundColor(Color.GREEN);
        }
    }
}
