package com.example.findag.repaso1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity
{
    private EditText edtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtenemos referencia a los controles que usaremos
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        btnAceptar = (Button) findViewById(R.id.btnBoton);

        // Implementamos el evento click del boton
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // Creamos el intent
                Intent intento = new Intent(MainActivity.this, SaludoActivity.class);

                // Creamos la informacion a pasar
                Bundle b = new Bundle();
                b.putString("NOMBRE", edtNombre.getText().toString());

                // Agregamos la informacion al string
                intento.putExtras(b);

                // Iniciamos la nueva activity
                startActivity(intento);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
