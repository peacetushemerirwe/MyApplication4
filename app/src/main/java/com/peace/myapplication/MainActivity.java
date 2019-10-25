package com.peace.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        //setContentView(R.layout.layout_main);

        Button set;
        set = findViewById(R.id.set);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Smart.class));
            }
        });
        //Button on;
        //on=findViewById(R.id.on);
        Button off;
        off=findViewById(R.id.off);

        //on.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View view) {
               // recreate();
           // }
        //});
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mine:
                startActivity(new Intent(MainActivity.this,Setting.class));
                default:
                    break;

        }
        return true;
    }
}
