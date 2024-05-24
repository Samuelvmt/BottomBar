package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView BottomNavView;
    MaterialToolbar idTopBar;
    FloatingActionButton idFAB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        // Apresentando o xml para o java
        idTopBar = findViewById(R.id.idTopBar);
        BottomNavView = findViewById(R.id.BottNav);
        idFAB = findViewById(R.id.idFAB);
       //Criando evento click no FAB
        idFAB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "FAB", Toast.LENGTH_SHORT).show();
           }
       });
        idTopBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Voltar", Toast.LENGTH_SHORT).show();
            }
        });
        //Criar um evento click na topbar
        idTopBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.mFavorite) {
                    Toast.makeText(MainActivity.this,
                            "Favorite", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mShare) {
                    Toast.makeText(MainActivity.this,
                            "Share", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mSearch) {
                    Toast.makeText(MainActivity.this,
                            "Search", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mLink) {
                    Toast.makeText(MainActivity.this,
                            "Link", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mCloud) {
                    Toast.makeText(MainActivity.this,
                            "Cloud", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mExplore) {
                    Toast.makeText(MainActivity.this,
                            "Explore", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mLocation) {
                    Toast.makeText(MainActivity.this,
                            "Location", Toast.LENGTH_SHORT).show();


                }

                return false;
            }
        });


        //criando um evento de clique nos itens de menu
        BottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.mNews) {
                    Toast.makeText(MainActivity.this,
                            "Cliquei em News", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mGlobal) {
                    Toast.makeText(MainActivity.this,
                            "Cliquei em Global", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mForYou) {
                    Toast.makeText(MainActivity.this,
                            "Cliquei em For You", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mTrending) {
                    Toast.makeText(MainActivity.this,
                            "Cliquei em Trending", Toast.LENGTH_SHORT).show();
                    ;


                }

                return false;

            }
        });
    }
}