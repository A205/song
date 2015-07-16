package com.example.yang;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button
            num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, add, sub, mul, div, demo, eql, clean;
    public double number1, number2, sum;
    public String string, yunsuan;
    public EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num0 = (Button) this.findViewById(R.id.num0);
        num1 = (Button) this.findViewById(R.id.num1);
        num2 = (Button) this.findViewById(R.id.num2);
        num3 = (Button) this.findViewById(R.id.num3);
        num4 = (Button) this.findViewById(R.id.num4);
        num5 = (Button) this.findViewById(R.id.num5);
        num6 = (Button) this.findViewById(R.id.num6);
        num7 = (Button) this.findViewById(R.id.num7);
        num8 = (Button) this.findViewById(R.id.num8);
        num9 = (Button) this.findViewById(R.id.num9);
        add = (Button) this.findViewById(R.id.add);
        sub = (Button) this.findViewById(R.id.sub);
        div = (Button) this.findViewById(R.id.div);
        mul = (Button) this.findViewById(R.id.mul);
        demo = (Button) this.findViewById(R.id.demo);
        eql = (Button) this.findViewById(R.id.eql);
        clean = (Button) this.findViewById(R.id.clean);
        editText = (EditText) this.findViewById(R.id.edittext);
        num0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "0";
                editText.setText(string);
            }

        });
        num1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "1";
                editText.setText(string);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "2";
                editText.setText(string);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "3";
                editText.setText(string);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "4";
                editText.setText(string);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "5";
                editText.setText(string);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "6";
                editText.setText(string);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "7";
                editText.setText(string);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "8";
                editText.setText(string);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + "9";
                editText.setText(string);
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = "";
                yunsuan = "";
                number1 = 0;
                number2 = 0;
                editText.setText(string);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number1 = Double.parseDouble(editText.getText().toString());
                yunsuan = "+";
                editText.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number1 = Double.parseDouble(editText.getText().toString());
                yunsuan = "-";
                editText.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number1 = Double.parseDouble(editText.getText().toString());
                yunsuan = "X";
                editText.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number1 = Double.parseDouble(editText.getText().toString());
                yunsuan = "/";
                editText.setText("");
            }
        });
        demo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString() + ".";
                editText.setText(string);

            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                string = editText.getText().toString();
                number2 = Double.parseDouble(string);
                if (yunsuan.equals("+")) {
                    sum = number1 + number2;
                    string = number1 + "+" + number2 + "=";
                    editText.setText(string + sum);
                }
                if (yunsuan.equals("-")) {
                    sum = number1 - number2;
                    string = number1 + "-" + number2 + "=";
                    editText.setText(string + sum);
                }
                if (yunsuan.equals("X")) {
                    sum = number1 * number2;
                    string = number1 + "X" + number2 + "=";
                    editText.setText(string + sum);
                }
                if (yunsuan.equals("/")) {
                    sum = number1 / number2;
                    string = number1 + "/" + number2 + "=";
                    editText.setText(string + sum);
                }
            }
        });
    }
}










