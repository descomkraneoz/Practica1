package net.iessochoa.manuelmartinez.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HoraActivity extends AppCompatActivity {
    public static String EXTRA_HORA="net.iessochoa.manuelmartinez.practica1.HoraActivity.HORA";

    TextView tvHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
        tvHora=findViewById(R.id.tvHora);

        String hora=getIntent().getStringExtra(EXTRA_HORA);

        tvHora.setText(getResources().getString(R.string.textoHora)+hora+" "
                +getResources().getString(R.string.textoNombre)+getResources().getString(R.string.miNombre));

    }
}
