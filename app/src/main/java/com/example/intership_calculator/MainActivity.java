package com.example.intership_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView answer_tv;
    Button zerobtn, onebtn,twobtn, threebtn, fourbtn, fivebtn, sixbtn, sevenbtn,eightbtn, ninebtn, all_clear, equalbtn,
            backbtn,addbtn,subbtn,multibtn,divibtn,dotbtn;
    String result;
    String tmp;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_tv = (TextView) findViewById(R.id.answer_tv);
        zerobtn = (Button) findViewById(R.id.zerobtn);
        onebtn = (Button) findViewById(R.id.onebtn);
        twobtn = (Button) findViewById(R.id.twobtn);
        threebtn = (Button) findViewById(R.id.threebtn);
        fourbtn = (Button) findViewById(R.id.fourbtn);
        fivebtn = (Button) findViewById(R.id.fivebtn);
        sixbtn = (Button) findViewById(R.id.sixbtn);
        sevenbtn = (Button) findViewById(R.id.sevenbtn);
        eightbtn = (Button) findViewById(R.id.eightbtn);
        ninebtn = (Button) findViewById(R.id.ninebtn);
        all_clear = (Button) findViewById(R.id.all_clear);
        equalbtn = (Button) findViewById(R.id.equalbtn);
        addbtn = (Button) findViewById(R.id.additionbtn);
        subbtn = (Button) findViewById(R.id.subtractbtn);
        multibtn = (Button) findViewById(R.id.multiplybtn);
        divibtn = (Button) findViewById(R.id.dividbtn);
        dotbtn = (Button) findViewById(R.id.dotbtn);

        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onNumberButtonClicked("0");
            }
        });
        onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("1");
            }
        });
        twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("2");
            }
        });
        threebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("3");
            }
        });
        fourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("4");
            }
        });
        fivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("5");
            }
        });
        sixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("6");
            }
        });
        sevenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("7");
            }
        });
        eightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("8");
            }
        });
        ninebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("9");
            }
        });
        all_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClicked();
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                onOperatorButtonClicked("-");
            }
        });
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("+");
            }
        });
        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("X");
            }
        });
        divibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("/");
            }
        });
        equalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqualButtonClicked();
            }
        });
        dotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked(".");
            }
        });
    }
    private void onEqualButtonClicked() {
        float res = 0;
        try {
            float number = Float.parseFloat(tmp);
            float number2 =  Float.parseFloat(answer_tv.getText().toString());
            switch (operator) {
                case "+":
                    res = number + number2;
                    break;
                case "/":
                    res = number / number2;
                    break;
                case "-":
                    res = number - number2;
                    break;
                case "X":
                    res = number * number2;
                    break;
            }
            result = String.valueOf(res);
            answer_tv.setText(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onOperatorButtonClicked(String operator) {
        tmp = answer_tv.getText().toString();
        onClearButtonClicked();
        this.operator = operator;
    }

    private void onClearButtonClicked() {
        result = "";
        answer_tv.setText("");
    }

    private void onNumberButtonClicked(String pos) {
        result = answer_tv.getText().toString();
        result = result + pos;
        answer_tv.setText(result);


    }
}