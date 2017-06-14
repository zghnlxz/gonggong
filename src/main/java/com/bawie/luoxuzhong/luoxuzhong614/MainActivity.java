package com.bawie.luoxuzhong.luoxuzhong614;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in =  getIntent();
        final EditText editText = (EditText) findViewById(R.id.editText11);
        if (in!=null){

             String s = in.getStringExtra("name");
            editText.setText(s);
        }

        Button button = (Button) findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,TwoActivity.class);
                if (editText.getText()!=null){
                    in.putExtra("name",editText.getText().toString());
                    startActivity(in);
                }else {
                    Toast.makeText(MainActivity.this,"请输入。。。",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
