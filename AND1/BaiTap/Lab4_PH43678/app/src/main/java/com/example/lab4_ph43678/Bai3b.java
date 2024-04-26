package com.example.lab4_ph43678;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai3b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3b);
        EditText edtuser = findViewById(R.id.edtUsername);
        EditText edtpass1 = findViewById(R.id.edtMk1);
        EditText edtpass2 = findViewById(R.id.edtMk2);
        Button btnDKi = findViewById(R.id.btnDangki);

        btnDKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtuser.getText().toString();
                String pass = edtpass1.getText().toString();
                String confrim = edtpass2.getText().toString();
                if(pass.equals(confrim)){
                    Toast.makeText(Bai3b.this, "ĐK success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Bai3b.this,Bai3a.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Username",user);
                    bundle.putString("Password",pass);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Bai3b.this, "ĐK fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}