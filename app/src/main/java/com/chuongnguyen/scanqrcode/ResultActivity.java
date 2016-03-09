package com.chuongnguyen.scanqrcode;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.chuongnguyen.scanqrcode.util.ContantVariables;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        txtResult = (TextView)findViewById(R.id.result);
        String result = getIntent().getExtras().getString(ContantVariables.KEY_RESULT);
        txtResult.setText(result);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add:
                Toast.makeText(this,"Add new item",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_remove:
                Toast.makeText(this,"Remove item",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"Hello Thang Cao", Toast.LENGTH_LONG).show();

                break;
        }
    }

}
