package th.ac.snru.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    EditText weightEditText;
    EditText hightEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        weightEditText = findViewById(R.id.weightEditText);
        hightEditText = findViewById(R.id.hightEditText);

    } // End onCreate

    public void onComputeClicked(){
        Intent intent = new Intent(getBaseContext(), ResultActivity.class);

        startActivity(intent);

    } // End onComputeClicked
} // End InputActivity

//Button computeButton;
//computeButton = findViewById(R.id.computeButton);
/*
        computeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ResultActivity.class);

                startActivity(intent);
            }
        });*/