package net.iessochoa.manuelmartinez.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    public static String EXTRA_NOMBRE="net.iessochoa.manuelmartinez.practica1.SaludoActivity.NOMBRE";

    TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        tvSaludo=findViewById(R.id.tvSaludo);

        String nombre=getIntent().getStringExtra(EXTRA_NOMBRE);
        tvSaludo.setText(getResources().getString(R.string.saludo)+" "+nombre);
    }
}
