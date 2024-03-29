package net.iessochoa.manuelmartinez.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    Button btAceptar;
    Button btHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre=findViewById(R.id.etNombre);
        btAceptar=findViewById(R.id.btAceptar);
        btHora=findViewById(R.id.btHora);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SaludoActivity.class);

                intent.putExtra(SaludoActivity.EXTRA_NOMBRE, etNombre.getText().toString());

                startActivity(intent);

            }
        });

        btHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateFormat dateFormat = new SimpleDateFormat(getResources().getString(R.string.formatoHora));
                Date date = new Date();

                Intent intentHora=new Intent(MainActivity.this,HoraActivity.class);
                intentHora.putExtra(HoraActivity.EXTRA_HORA,dateFormat.format(date));

                startActivity(intentHora);


            }
        });
    }
}