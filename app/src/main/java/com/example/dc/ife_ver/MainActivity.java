package com.example.dc.ife_ver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView lista;
    String materias[] = {"IFE tipo C", "IFE tipo D", "INE tipo E-F", "IFE borde", "DC"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listview2);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, materias);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "IDENTIFICACION: " + materias[position],Toast.LENGTH_SHORT).show();
                if(position == 0 ){
                    Intent actividad0 = new Intent(MainActivity.this,IfeTipoC.class);
                    startActivity(actividad0);
                }
                if(position == 1 ){
                    Intent actividad1 = new Intent(MainActivity.this,IfeTipoD.class);
                    startActivity(actividad1);
                }
                if(position == 2 ){
                    Intent actividad2 = new Intent(MainActivity.this,IneTipoEF.class);
                    startActivity(actividad2);
                }
                if(position == 3 ){
                    Intent actividad3 = new Intent(MainActivity.this,IfeBorde.class);
                    startActivity(actividad3);
                }
            }
        });
    }
}
