package com.haya.selfintroductionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click = findViewById(R.id.click_Button);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.i("クリックテスト", "出力確認");
                EditText editName = findViewById(R.id.edtName);
                EditText edtPhone = findViewById(R.id.edtPhone);
//                Log.i("クリックテスト", edtPhone.getText().toString() );
                Toast.makeText(
                    MainActivity.this,
                    "名前：" + editName.getText().toString() + "\n" + "電話番号：" + edtPhone.getText().toString(),
                     Toast.LENGTH_LONG).show();
            }
        });
    }
}