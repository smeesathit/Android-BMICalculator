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
    EditText hightEditText;
    Button computeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        weightEditText = (EditText) findViewById(R.id.weightEditText);
        hightEditText = (EditText) findViewById(R.id.hightEditText);
        computeButton = (Button) findViewById(R.id.computeButton);
        computeButton.setOnClickListener(this);
    } // End onCreate

    @Override
    public void onClick(View v) {
        //Toast.makeText(getBaseContext(), "You clicked Compute button!", Toast.LENGTH_SHORT).show();
        if (weightEditText.getText().toString().equals("")) {
            Toast.makeText(getBaseContext(), R.string.weightError, Toast.LENGTH_SHORT).show();
        } else if (hightEditText.getText().toString().equals("")){
            Toast.makeText(getBaseContext(), R.string.hightError, Toast.LENGTH_SHORT).show();
        } else {
            // Toast.makeText(getBaseContext(), "Go to next activity", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getBaseContext(), ResultActivity.class);

            // Set data
            String weight;
            String hight;
            weight = weightEditText.getText().toString();
            hight = hightEditText.getText().toString();
            intent.putExtra("weight", weight);
            intent.putExtra("hight", hight);
            // open another Activity
            startActivity(intent);
        }
    } // End onClick
} // End InputActivity


/*
        Intent intent = new Intent(getBaseContext(), ResultActivity.class);
        String weight;
        String hight;
        weight = weightEditText.getText().toString();
        hight = hightEditText.getText().toString();
        intent.putExtra("weight", weight);
        intent.putExtra("hight", hight);
        startActivity(intent);
*/
