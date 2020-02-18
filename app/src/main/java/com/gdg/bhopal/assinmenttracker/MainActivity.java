package com.gdg.bhopal.assinmenttracker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button Btn;
        final String arr[]=new String[5];
        final String sem;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sem=findViewById(R.id.sem).toString();
        arr[0]=findViewById(R.id.sub1).toString();
        arr[1]=findViewById(R.id.sub2).toString();
        arr[2]=findViewById(R.id.sub3).toString();
        arr[3]=findViewById(R.id.sub4).toString();
        arr[4]=findViewById(R.id.sub5).toString();

        Btn=(Button)findViewById(R.id.SubmitBtn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,TrackerWindow.class);
                //i.putExtra("sem",sem.getText().toString(),"sub1",arr[0].getText().toString(),"sub2",arr[1].getText().toString(),"sub3",arr[2].getText().toString(),"sub4",arr[3].getText().toString(),"sub5",arr[4].getText().toString());
//                i.putExtra("sem",sem,"sub",arr[2].getBytes().toString());
                i.putExtra("sub",arr.toString());
                i.putExtra("sub2",arr.toString());
//                i.putExtra("sem",sem);
                startActivity(i);
            }
        });{


        };

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
