package com.example.aeu_app.Converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.aeu_app.R;
import com.google.android.material.textfield.TextInputEditText;

public class KhrtoeuroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_khrtoeuro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        convertKhtoeuro();
    }
    private void convertKhtoeuro(){

        Button btnConverKHRtoEURO = findViewById(R.id.btnConverKHRtoEURO);

        btnConverKHRtoEURO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationKhtoeuro();
            }
        });
    }
    private void operationKhtoeuro(){
        TextInputEditText txtEditKHRtoEURO = findViewById(R.id.txtEditKHRtoEURO);
        TextView txtKHRtoEURO = findViewById(R.id.txtKHRtoEURO);

        String khrAmount = txtEditKHRtoEURO.getText().toString();
        double euroAmount = Double.parseDouble(khrAmount);

        double euroResult = operationKHtoUSD(euroAmount);
        // Display the result in TextView

        txtKHRtoEURO.setText(String.format("%.2f" + " EURO", euroResult));
    }
    private double operationKHtoUSD(double khrAmount){
        return khrAmount / 4456;
    }
}