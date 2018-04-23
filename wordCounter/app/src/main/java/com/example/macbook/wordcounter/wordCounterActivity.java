package com.example.macbook.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class wordCounterActivity extends AppCompatActivity {

    private EditText inputTextToEdit;
    private TextView outputAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        inputTextToEdit = findViewById(R.id.inputTextToEdit);
        outputAnswer = findViewById(R.id.outputAnswer);
    }
}
