package th.ac.snru.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {
    EditText weightEditText;
    EditText heightEditText;
    Button computeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        weightEditText = findViewById(R.id.weightEditText);
        heightEditText = findViewById(R.id.heightEditText);
        computeButton = findViewById(R.id.computeButton);
        computeButton.setOnClickListener(this);
    } // End onCreate

    @Override
    public void onClick(View v) {
        //Toast.makeText(getBaseContext(), "You clicked Compute button!", Toast.LENGTH_SHORT).show();
        if (weightEditText.getText().toString().equals("")) {
            Toast.makeText(getBaseContext(), R.string.weightError, Toast.LENGTH_SHORT).show();
        } else if (heightEditText.getText().toString().equals("")){
            Toast.makeText(getBaseContext(), R.string.heightError, Toast.LENGTH_SHORT).show();
        } else {
            // Toast.makeText(getBaseContext(), "Go to next activity", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getBaseContext(), ResultActivity.class);

            // Set data
            String weight;
            String height;
            weight = weightEditText.getText().toString();
            height = heightEditText.getText().toString();
            intent.putExtra("weight", weight);
            intent.putExtra("height", height);
            // open another Activity
            startActivity(intent);
        }
    } // End onClick
} // End InputActivity


/*
        Intent intent = new Intent(getBaseContext(), ResultActivity.class);
        String weight;
        String height;
        weight = weightEditText.getText().toString();
        height = heightEditText.getText().toString();
        intent.putExtra("weight", weight);
        intent.putExtra("height", height);
        startActivity(intent);
*/
