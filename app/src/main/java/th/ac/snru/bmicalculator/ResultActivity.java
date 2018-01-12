package th.ac.snru.bmicalculator;

import android.content.Intent;
import java.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String wText = intent.getStringExtra("weight");
        String hText = intent.getStringExtra("hight");

       // String message = "Weight = " + wText + "  " + "Hight = "+ hText;
       // Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
        double w;
        double h;
        double bmi;

        w = Double.parseDouble(wText);
        h = Double.parseDouble(hText);

        h = h / 100.0;
        bmi = w / (h * h);

        TextView bmiValue = findViewById(R.id.bmiValue);
        // bmiValue.setText(String.valueOf(bmi));
        DecimalFormat df = new DecimalFormat("0.00");
        bmiValue.setText(df.format(bmi));
        // bmiValue.setText(String.format("%.2f", bmi));
    } // End onCreate
} // End ResultActivity
