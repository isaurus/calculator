package com.example.calculator.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculator.R;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtOperation;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initViews();

        findViewById(R.id.btnCero).setOnClickListener(this::printNum);
        findViewById(R.id.btnOne).setOnClickListener(this::printNum);
        findViewById(R.id.btnTwo).setOnClickListener(this::printNum);
        findViewById(R.id.btnThree).setOnClickListener(this::printNum);
        findViewById(R.id.btnFour).setOnClickListener(this::printNum);
        findViewById(R.id.btnFive).setOnClickListener(this::printNum);
        findViewById(R.id.btnSix).setOnClickListener(this::printNum);
        findViewById(R.id.btnSeven).setOnClickListener(this::printNum);
        findViewById(R.id.btnEight).setOnClickListener(this::printNum);
        findViewById(R.id.btnNine).setOnClickListener(this::printNum);
        findViewById(R.id.btnDecimalPoint).setOnClickListener(this::printNum);

        findViewById(R.id.btnAC).setOnClickListener(this::clearAll);

        findViewById(R.id.btnAdd).setOnClickListener(this::printNum);
        findViewById(R.id.btnSubstract).setOnClickListener(this::printNum);
        findViewById(R.id.btnMultiplicate).setOnClickListener(this::printNum);
        findViewById(R.id.btnDivide).setOnClickListener(this::printNum);
        findViewById(R.id.btnRemainder).setOnClickListener(this::printNum);
    }

    private void initViews() {
        edtOperation = findViewById(R.id.edtOperation);
        txtResult = findViewById(R.id.txtResult);
    }

    private void printNum(View v){
        Button btn = (Button) v;
        edtOperation.append(btn.getText().toString());
    }

    private void clearAll(View v){
        edtOperation.setText("");
        txtResult.setText("");
    }

    private void formatNumber(String numberSequence){
        DecimalFormat pattern = new DecimalFormat("#.###");
        pattern.format(numberSequence);
    }


}