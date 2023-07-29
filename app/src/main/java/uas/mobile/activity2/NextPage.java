package uas.mobile.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NextPage extends AppCompatActivity {
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        result = findViewById(R.id.resultText);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        result.setText(data);
    }
}