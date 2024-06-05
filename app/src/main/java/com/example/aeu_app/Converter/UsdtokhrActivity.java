package com.example.aeu_app.Converter;

import android.gesture.OrientedBoundingBox;
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

public class UsdtokhrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_usdtokhr);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        convertUsdtokhr();
    }

    private void convertUsdtokhr(){

        Button btnConverUSDtoKHR = findViewById(R.id.btnConverUSDtoKHR);

        btnConverUSDtoKHR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationUsdtokhr();
            }
        });
    }
    private void operationUsdtokhr(){
        TextInputEditText txtEditKHR = findViewById(R.id.txtEditUSD);
        TextView txtUSDtoKHR = findViewById(R.id.txtUSDtoKHR);

        String usdAmount = txtEditKHR.getText().toString();
        double khAmount = Double.parseDouble(usdAmount);

        double khrResult = operationUSDtoKHR(khAmount);
        // Display the result in TextView
        txtUSDtoKHR.setText(String.format("%.2f" + " KHR", khrResult));
    }
    private double operationUSDtoKHR(double khAmount){
       return khAmount * 4100;
    }

}