package com.example.gabriel.rw3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;



public class CadastroActivity extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final EditText campo_cpf = (EditText) findViewById(R.id.campo_cpf);
        campo_cpf.addTextChangedListener(Mask.insert("###.###.###-##", campo_cpf));
    }

}
