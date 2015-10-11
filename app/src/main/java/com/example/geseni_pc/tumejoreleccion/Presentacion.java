package com.example.geseni_pc.tumejoreleccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Presentacion extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        TextView descripcion=(TextView)findViewById(R.id.descripcion);
        TextView concepto=(TextView)findViewById(R.id.concepto);
        TextView principio=(TextView)findViewById(R.id.principio);
        TextView concepto_principio=(TextView)findViewById(R.id.conceptoPrincipio);
        TextView creencia=(TextView)findViewById(R.id.creencia);
        TextView concepto_creencia=(TextView)findViewById(R.id.conceptoCreencia);
        TextView valor=(TextView)findViewById(R.id.valor);
        TextView concepto_valor=(TextView)findViewById(R.id.conceptoValor);
        Button empezartest=(Button)findViewById(R.id.empezartest);

        empezartest.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_presentacion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent empezartest=new Intent(Presentacion.this,Formulario.class);
        startActivity(empezartest);


        //Intent sig = new Intent(Formulario.this, PreguntaGenral.class);
       // startActivity(sig);

    }
}
