package com.example.jsu.testingguidelines;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    String[] index;
    double answer = 0;
    private StringBuilder sb = new StringBuilder("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
    }
    public void btnZero(View v){
        sb.append("0");
        result.setText(sb);

    }
    public void btnOne(View v){
        sb.append("1");
        result.setText(sb);
    }

    public void btnTwo(View v){
        sb.append("2");
        result.setText(sb);
    }

    public void btnThree(View v){
        sb.append("3");
        result.setText(sb);
    }

    public void btnFour(View v){
        sb.append("4");
        result.setText(sb);
    }

    public void btnFive(View v){
        sb.append("5");
        result.setText(sb);
    }

    public void btnSix(View v){
        sb.append("6");
        result.setText(sb);
    }

    public void btnSeven(View v){
        sb.append("7");
        result.setText(sb);
    }

    public void btnEight(View v){
        sb.append("8");
        result.setText(sb);
    }

    public void btnNine(View v){
        sb.append("9");
        result.setText(sb);
    }


    public void btnPlus(View v){
        sb.append(" ");
        sb.append("+");
        sb.append(" ");
        result.setText(sb);
    }

    public void btnMinus(View v){
        sb.append(" ");
        sb.append("-");
        sb.append(" ");
        result.setText(sb);
    }

    public void btnDivide(View v){
        sb.append(" ");
        sb.append(getString(R.string.u00f7));
        sb.append(" ");
        result.setText(sb);
    }

    public void btnMultiply(View v){
        sb.append(" ");
        sb.append(getString(R.string.u00d7));
        sb.append(" ");
        result.setText(sb);
    }

    public void btnPercentage(View v){
        sb.append("%");
        sb.append(" ");
        result.setText(sb);
    }

    public void btnSquareRoot(View v){
        sb.append(getString(R.string.sqrt));
        sb.append(" ");
        result.setText(sb);
    }

    public void btnDot(View v){
        sb.append(".");
        result.setText(sb);
    }

    public void btnSign(View v){
        if(Double.valueOf(sb.charAt(0))>=0){
            sb.insert(0, "-");
        }
        else{
            sb.deleteCharAt(0);
        }
        result.setText(sb);
    }

    public void btnCancel(View v){
        result.setText("");
        sb.delete(0, sb.length());

    }


    public void btnEqual(View v){
        index = sb.toString().split(" ");
        if(index.length == 3){
            double num1 = Double.valueOf(index[0]);
            double num2 = Double.valueOf(index[2]);
            String op = index[1];

            if(op.equals("+")){
                answer = num1 + num2;
            }
            else if(op.equals("-")){
                answer = num1 - num2;
            }
            else if(op.equals(getString(R.string.u00d7))){
                answer = num1 * num2;
            }
            else if(op.equals((getString(R.string.u00f7)))){
                answer = num1/num2;
            }

            sb.delete(0, sb.length());
            result.setText(String.valueOf(answer));
            sb.append(answer);
        }

        else if(index.length == 2){
            String op = index[0];
            Double num1 = Double.valueOf(index[1]);

            if(op.equals(getString(R.string.sqrt))){
                answer = Math.sqrt(num1);
            }
            else if(op.equals(getString(R.string.percentage))){
                answer = num1/100;
            }
        }

        sb.delete(0,sb.length());
        result.setText(String.valueOf(answer));
        sb.append(answer);

    }




}
