package com.teste.tetocerto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        botao = findViewById(R.id.bottomNavigation);
        botao.setOnItemSelectedListener(item ->{
            int id = item.getItemId();
            if(id == R.id.nav_limit){
                startActivity(new Intent(MainActivity.this, FragmentLimitConfig.class));
                return true;
            }
            else if(id == R.id.nav_home){
                return true;
            }
            return false;
        });

    }
}