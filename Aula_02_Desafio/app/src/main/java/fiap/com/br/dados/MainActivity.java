package fiap.com.br.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random gerador = new Random();
    private ImageView imgDado1;
    private ImageView imgDado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDado1 = findViewById(R.id.imgDado1);
        imgDado2 = findViewById(R.id.imgDado2);
    }

    public void rolarDados(View view) {
        switch (gerador.nextInt(6)) {
            case 1:
                imgDado1.setImageResource(R.drawable.d1);
                break;
            case 2:
                imgDado1.setImageResource(R.drawable.d2);
                break;
            case 3:
                imgDado1.setImageResource(R.drawable.d3);
                break;
            case 4:
                imgDado1.setImageResource(R.drawable.d4);
                break;
            case 5:
                imgDado1.setImageResource(R.drawable.d5);
                break;
            default:
                imgDado1.setImageResource(R.drawable.d6);
                break;
        }

        switch (gerador.nextInt(6)) {
            case 1:
                imgDado2.setImageResource(R.drawable.d1);
                break;
            case 2:
                imgDado2.setImageResource(R.drawable.d2);
                break;
            case 3:
                imgDado2.setImageResource(R.drawable.d3);
                break;
            case 4:
                imgDado2.setImageResource(R.drawable.d4);
                break;
            case 5:
                imgDado2.setImageResource(R.drawable.d5);
                break;
            default:
                imgDado2.setImageResource(R.drawable.d6);
                break;
        }
    }

    private int rolagemJogador1() {
        return gerador.nextInt(6);
    }

    private int rolagemJogador2() {
        return gerador.nextInt(6);
    }

}
