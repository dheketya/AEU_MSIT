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

public class EurotokhrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eurotokhr);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        convertEurotokhr();
    }
    private void convertEurotokhr(){

        Button btnConverEUROtoKHR = findViewById(R.id.btnConverEUROtoKHR);

        btnConverEUROtoKHR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationEurotokhr();
            }
        });
    }
    private void operationEurotokhr(){
        TextInputEditText txtEditEUROtoKHR = findViewById(R.id.txtEditEUROtoKHR);
        TextView txtEUROtoKHR = findViewById(R.id.txtEUROtoKHR);

        String euroAmount = txtEditEUROtoKHR.getText().toString();
        double khAmount = Double.parseDouble(euroAmount);

        double euroResult = operationKHtoUSD(khAmount);
        // Display the result in TextView

        txtEUROtoKHR.setText(String.format("%.2f" + " EURO", euroResult));
    }
    private double operationKHtoUSD(double euroAmount){
        return euroAmount * 4456;
    }

}