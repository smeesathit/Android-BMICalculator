package th.ac.snru.bmicalculator;

import android.content.Intent;
import java.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String wText = intent.getStringExtra("weight");
        String hText = intent.getStringExtra("height");

       // String message = "Weight = " + wText + "  " + "height = "+ hText;
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
        TextView bmiHeader = findViewById(R.id.bmiHeader);
        TextView bmiDescription = findViewById(R.id.bmiDescription);

        if (bmi < 18.5){
            bmiHeader.setText(R.string.underWeightHeader);
            bmiDescription.setText(R.string.underWeight);
        } else if (bmi >= 18.5 && bmi < 25) {
            bmiHeader.setText(R.string.normalWeightHeader);
            bmiDescription.setText(R.string.normalWeight);
        } else {
            bmiHeader.setText(R.string.overWeightHeader);
            bmiDescription.setText(R.string.overWeight);
        }

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
    } // End onCreate


    @Override
    public void onClick(View v) {
        finish();
    } // End onClick
} // End ResultActivity
