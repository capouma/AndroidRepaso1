package com.example.findag.repaso1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SaludoActivity extends ActionBarActivity
{
    private TextView txvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        // Obtenemos referencia a nuestro control
        txvSaludo = (TextView) findViewById(R.id.txvSaludo);

        // Recuperamos la informacion pasada en el Intent
        Bundle bundle = getIntent().getExtras();

        // Construimos el mensaje a mostrar
        txvSaludo.setText("Buenos dias " + bundle.getString("NOMBRE"));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_saludo, menu);
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
}
