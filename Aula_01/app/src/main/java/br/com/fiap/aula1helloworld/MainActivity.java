package br.com.fiap.aula1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edtNumero = findViewById(R.id.edtNumero);
    }

    public void mensaginha(View view) {
        String txt = this.edtNumero.getText().toString();

        Toast.makeText(this, "Primeiro Toast com o que foi recuperado da tela " + txt,
                Toast.LENGTH_LONG).show();
    }
}
