package com.example.yang.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        public class MainActivity extends Activity {
            private EditText height = null;
            private EditText weight = null;
            private Button button = null;
            private TextView show = null;

            public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.BMIbutton);

        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        show = (TextView) findViewById(R.id.show);

        button.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h);

                double final_resault = exchangeResault(bmi);
                if (bmi < 18.5) {
                    show.setText("体重过轻，比较好");
                } else if (bmi >= 18.5 && bmi < 24) {
                    show.setText("体重正常，很好");
                } else if (bmi >= 24 && bmi < 27) {
                    show.setText("体重稍重，一般");
                } else if (bmi >= 27 && bmi < 30) {
                    show.setText("轻度肥胖，还行");
                } else if (bmi >= 30 && bmi < 35) {
                    show.setText("中度肥胖，不怎么好");
                } else if (bmi > 35) {
                    show.setText("重度肥胖，不好");
                }
            }
        });
    }

    public double exchangeResault(double resault) {
        double first = resault * 100;
        double second = (int) first;
        double second_first = first - second;

        if (second_first > 0.5) {
            second++;
        }

        double jirguo = (double) second / 100;
        return jirguo;
    }
}
