package com.example.gabriel.rw3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

    }


    public void irParaTelaCadastro(View view) {


        startActivity(new Intent(this, CadastroActivity.class));



    }
    public void irParaTelaLogin(View view) {

        startActivity(new Intent(this, LoginActivity.class));
    }

}
