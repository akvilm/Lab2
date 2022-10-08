package com.example.lab2;

import static com.example.lab2.R.id.tvResult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spCounterOption;
    private EditText etEnteredText;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCounterOption = findViewById(R.id.spCounterOption);
        this.etEnteredText = findViewById(R.id.etEnteredText);
        this.tvResult = findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCounterOption.setAdapter(adapter);

    }

    public void onBtnClickCount(View view) {
        String spSelectedOption = this.spCounterOption.getSelectedItem().toString();
        String charString = getString(R.string.selection_chars);
        String wordString = getString(R.string.selection_words);

        if(spSelectedOption.equalsIgnoreCase(charString)) {
            String enteredUserText = this.etEnteredText.getText().toString();
            if (enteredUserText.isEmpty()) {
                Toast.makeText(this, "Input field is empty", Toast.LENGTH_SHORT).show();
            }
            else {
                int charsCount = TextCounter.getCharsCount(enteredUserText);

                this.tvResult.setText(String.valueOf(charsCount));
            }
        }
        else {
            String enteredUserText = this.etEnteredText.getText().toString();
            if (enteredUserText.isEmpty()) {
                Toast.makeText(this,"Input field is empty", Toast.LENGTH_SHORT).show();
            }
            else {
                int wordsCount = TextCounter.getWordsCount(enteredUserText);

                this.tvResult.setText(String.valueOf(wordsCount));
            }
        }
    }
}