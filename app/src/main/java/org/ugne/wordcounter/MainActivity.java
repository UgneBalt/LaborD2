package org.ugne.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner countingTypeSpinner;
    private TextView inputText;
    private Button buttonCount;
    private TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countingTypeSpinner = findViewById(R.id.countingTypeSpinner);
        inputText = findViewById(R.id.inputText);
        buttonCount = findViewById(R.id.buttonCount);
        outputView = findViewById(R.id.outputView);

        buttonCount.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                CharSequence userText = inputText.getText();
                if(userText.length()==0)
                {
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, R.string.toast_name, duration);
                    toast.show();
                }
                else
                {
                    int itemCountIndex = countingTypeSpinner.getSelectedItemPosition();
                    // jeigu itemCountIndex=0, tai skaiciuosime zodzius, kitaip - zenklus

                    WordCounter counter = new WordCounter();
                    int result = counter.count(userText, itemCountIndex);
                    outputView.setText("Rezultatas: "+result);
                }

            }
        });
    }
}