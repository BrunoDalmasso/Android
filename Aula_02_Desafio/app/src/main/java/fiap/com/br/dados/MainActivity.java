package fiap.com.br.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random gerador = new Random();
    private ImageView imgDado1;
    private ImageView imgDado2;

    private int[] imagens = {
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3,
            R.drawable.d4,
            R.drawable.d5,
            R.drawable.d6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imgDado1 = findViewById(R.id.imgDado1);
        this.imgDado2 = findViewById(R.id.imgDado2);
    }

    public void rolarDados(View view) {
        int jogada1 = new Random().nextInt(imagens.length);
        int jogada2 = new Random().nextInt(imagens.length);

        this.imgDado1.setImageResource(imagens[jogada1]);
        this.imgDado2.setImageResource(imagens[jogada2]);

        if (jogada1 == jogada2) {
            Toast.makeText(this, "Ocorreu um epate!!!", Toast.LENGTH_LONG).show();
        } else if (jogada1 > jogada2) {
            Toast.makeText(this, "O jagador 1 ganhou!!!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "O jagador 2 ganhou!!!", Toast.LENGTH_LONG).show();
        }
    }

}
