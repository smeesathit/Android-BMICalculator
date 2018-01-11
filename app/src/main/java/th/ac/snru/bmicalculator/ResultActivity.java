package th.ac.snru.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String wText = intent.getStringExtra("weight");
        String hText = intent.getStringExtra("hight");

        String message = "Weight = " + wText + "  " + "Hight = "+ hText;
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();


    } // End onCreate
} // End ResultActivity
