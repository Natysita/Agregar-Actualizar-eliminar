package com.example.geseni_pc.tumejoreleccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class PreguntasTest extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_test);
        TextView uno=(TextView)findViewById(R.id.uno);
        TextView unoA=(TextView) findViewById(R.id.unoA);
        CheckBox a1=(CheckBox)findViewById(R.id.a1);
        CheckBox a2=(CheckBox)findViewById(R.id.a2);
        CheckBox a3=(CheckBox)findViewById(R.id.a3);
        CheckBox a4=(CheckBox)findViewById(R.id.a4);
        TextView unoB=(TextView)findViewById(R.id.unoB);
        CheckBox b1=(CheckBox) findViewById(R.id.b1);
        CheckBox b2=(CheckBox)findViewById(R.id.b2);
        CheckBox b3=(CheckBox)findViewById(R.id.b3);
        CheckBox b4=(CheckBox)findViewById(R.id.b4);
        TextView unoC=(TextView) findViewById(R.id.unoC);
        CheckBox c1=(CheckBox)findViewById(R.id.c1);
        CheckBox c2=(CheckBox) findViewById(R.id.c2);
        CheckBox c3=(CheckBox)findViewById(R.id.c3);
        CheckBox c4=(CheckBox)findViewById(R.id.c4);
        TextView unoD=(TextView)findViewById(R.id.unoD);
        CheckBox d1=(CheckBox)findViewById(R.id.d1);
        CheckBox d2=(CheckBox)findViewById(R.id.d2);
        CheckBox d3=(CheckBox)findViewById(R.id.d3);
        CheckBox d4=(CheckBox)findViewById(R.id.d4);

        Button resultados=(Button)findViewById(R.id.resultados);

        resultados.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_preguntas_test, menu);
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
        Intent resultados=new Intent(PreguntasTest.this, ResultadosTest.class);
        startActivity(resultados);

    }
}
