package com.example.calculator4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button numDots;
    private Button clean;
    private TextView result;
    private Button switchBtn;
    private Button switchBtn2;
    private ConstraintLayout proCalc;
    private FrameLayout calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setOnClick();
    }

    private void initViews() {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        clean = findViewById(R.id.clean);
        numDots = findViewById(R.id.numDots);
        result = findViewById(R.id.result);
        switchBtn = findViewById(R.id.switchButton);
        switchBtn2 = findViewById(R.id.button38);
        calc = findViewById(R.id.calc);
        proCalc = findViewById(R.id.procalculator);


    }

    private void setOnClick() {
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num1, result);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num2, result);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num3, result);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num4, result);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num5, result);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num6, result);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num7, result);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num8, result);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num9, result);
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNum(num0, result);
            }
        });
        numDots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textView = result.getText().toString();
                if (textView.contains(".")) return;
                textView += numDots.getText().toString();
                result.setText(textView);
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        switchBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setVisibility(View.VISIBLE);
                proCalc.setVisibility(View.INVISIBLE);
            }
        });
        switchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setVisibility(View.INVISIBLE);
                proCalc.setVisibility(View.VISIBLE);
            }
        });
    }

    public void onClickNum (Button button, TextView result) {
        String textView = result.getText().toString();
        textView += button.getText().toString();
        result.setText(textView);
    }
}
