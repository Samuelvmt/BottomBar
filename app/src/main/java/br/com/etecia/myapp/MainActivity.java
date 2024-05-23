package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView BottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // Apresentando o xml para o java
        BottomNavView = findViewById(R.id.BottNav);

        //criando um evento de clique nos itens de menu
        BottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mNews:
                        Toast.makeText(MainActivity.this,
                                "Cliquei em News", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                    case R.id.mNews:
                        Toast.makeText(MainActivity.this,
                                "Cliquei em Global", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                    case R.id.mNews:
                        Toast.makeText(MainActivity.this,
                                "Cliquei em For You", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                    case R.id.mNews:
                        Toast.makeText(MainActivity.this,
                                "Cliquei em Trending", Toast.LENGTH_SHORT).show();
                        ;
                        break;

                }

                return false;

            }
        });
    }
}