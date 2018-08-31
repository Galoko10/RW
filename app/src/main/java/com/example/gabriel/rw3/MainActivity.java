package com.example.gabriel.rw3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void irParaTelaCadastro(View view) {

        Intent intent1 = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(intent1);



    }
    public void irParaTelaLogin(View view) {

        Intent intent2 = new Intent(getApplicationContext(), Login.class);
        startActivity(intent2);
    }

}
