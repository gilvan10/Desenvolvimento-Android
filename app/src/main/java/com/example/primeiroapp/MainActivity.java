package com.example.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button buttonLimpar;
    private Button buttonConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);
        buttonLimpar = (Button)findViewById(R.id.buttonLimpar);
        buttonConfirmar = (Button)findViewById(R.id.buttonConfirmar);

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText(R.string.text_padrao);
            }
        });


    }
    public void confirmar(View view) {
        textView.setText(editText.getText());
    }
}
