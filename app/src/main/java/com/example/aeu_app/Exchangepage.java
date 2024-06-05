package com.example.aeu_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.aeu_app.Converter.EurotokhrActivity;
import com.example.aeu_app.Converter.KhrtoeuroActivity;
import com.example.aeu_app.Converter.KhrtousdActivity;
import com.example.aeu_app.Converter.UsdtokhrActivity;

public class Exchangepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exchangepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        khrtousdConverter();
        usdtokhrConverter();
        khrtoeuroConverter();
        eurotokhrConverter();
    }

    private void khrtousdConverter() {
        Button btnKHRtoUSD = (Button) findViewById(R.id.btnKHRtoUSD);
        btnKHRtoUSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exchangepage.this, KhrtousdActivity.class));
            }
        });
    }

    private void usdtokhrConverter() {
        Button btnUSDtoKHR = (Button) findViewById(R.id.btnUSDtoKHR);
        btnUSDtoKHR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exchangepage.this, UsdtokhrActivity.class));
            }
        });
    }

    private void khrtoeuroConverter() {
        Button btnKHRtoEURO = (Button) findViewById(R.id.btnKHRtoEURO);
        btnKHRtoEURO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exchangepage.this, KhrtoeuroActivity.class));
            }
        });
    }

    private void eurotokhrConverter() {
        Button btnEUROtoKHR = (Button) findViewById(R.id.btnEUROtoKHR);
        btnEUROtoKHR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exchangepage.this, EurotokhrActivity.class));
            }
        });
    }

}