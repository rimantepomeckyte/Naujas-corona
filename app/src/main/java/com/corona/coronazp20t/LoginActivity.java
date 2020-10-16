package com.corona.coronazp20t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //kodas reikalingas atidaryti tuscia langa
        setContentView(R.layout.activity_login);//i tuscia langa ikrauna nauja vaizda
        //visas kodas rasomos zemiau
         Button login_btn = findViewById(R.id.login_btn);//tokiu budu issitraukiam elementus
        // is vaizdo
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cia bus vykdomas kodas po mygtuko paspaudimo
                Toast.makeText(LoginActivity.this,
                        "Prisijungimo Vardas:"+username.getText().toString()+"\n"+
                        "Slaptazodis:"+password.getText().toString(), Toast.LENGTH_SHORT).show();
                //ketinimas pereiti i paieskos langa
                Intent goToSearchActivity=new Intent(LoginActivity.this,//is sio lango
                        SearchActivity.class);//i si langa
                startActivity(goToSearchActivity);
            }
        });

    }
}
