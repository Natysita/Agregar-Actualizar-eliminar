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

public class Formulario extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        TextView facebook=(TextView)findViewById(R.id.facebook);
        TextView correoelectronico=(TextView)findViewById(R.id.correo);
        EditText usuario=(EditText)findViewById(R.id.usuario);
        TextView contraseña=(TextView) findViewById(R.id.contraseña);
        EditText password=(EditText)findViewById(R.id.password);
        Button ingresar=(Button)findViewById(R.id.ingresar);

        ingresar.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_formulario, menu);
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
        Intent ingresar=new Intent(Formulario.this,PreguntasTest.class);
        startActivity(ingresar);

    }
}
