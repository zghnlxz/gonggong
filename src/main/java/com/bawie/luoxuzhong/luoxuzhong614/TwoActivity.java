package com.bawie.luoxuzhong.luoxuzhong614;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent in =  getIntent();
        String s =in.getStringExtra("name");

        final EditText editText = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button2);


        editText.setText(s);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(TwoActivity.this,MainActivity.class);
                if (editText.getText()!=null){
                    in.putExtra("name",editText.getText().toString());
                    startActivity(in);
                }else {
                    Toast.makeText(TwoActivity.this,"请输入。。。",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
