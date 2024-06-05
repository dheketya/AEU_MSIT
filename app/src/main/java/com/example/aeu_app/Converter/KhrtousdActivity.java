package com.example.aeu_app.Converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.aeu_app.Exchangepage;
import com.example.aeu_app.R;
import com.google.android.material.textfield.TextInputEditText;

public class KhrtousdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_khrtousd);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        convertKhtousd();
    }
        private void convertKhtousd(){

        Button btnConverKHRtoUSD = findViewById(R.id.btnConverKHRtoUSD);

        btnConverKHRtoUSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationKhtousd();
            }
        });
    }
    private void operationKhtousd(){
        TextInputEditText txtEditKHR = findViewById(R.id.txtEditKHR);
        TextView txtKHRtoUSD = findViewById(R.id.txtKHRtoUSD);

        String khrAmount = txtEditKHR.getText().toString();
        double khAmount = Double.parseDouble(khrAmount);

        double usdResult = operationKHtoUSD(khAmount);
        // Display the result in TextView
        txtKHRtoUSD.setText(String.format("%.2f" + " USD", usdResult));
    }
    private double operationKHtoUSD(double khrAmount){
        return khrAmount / 4100;
    }
}