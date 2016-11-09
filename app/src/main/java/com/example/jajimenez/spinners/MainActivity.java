package com.example.jajimenez.spinners;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.jajimenez.spinners.R.layout.fila;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener{
    //ListView lista;
    ArrayList<Equipo> cosas = new ArrayList<Equipo>();
    ImageView imagen;

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        cosas.add(new Equipo("Boston Celtics", getResources().getDrawable(R.drawable.celtics)));
        cosas.add(new Equipo("Brooklyn Nets", getResources().getDrawable(R.drawable.nets)));
        cosas.add(new Equipo("Atlanta Hawks", getResources().getDrawable(R.drawable.hawks)));
        cosas.add(new Equipo("Chicago Bulls", getResources().getDrawable(R.drawable.bulls)));
        cosas.add(new Equipo("Cleveland Cavaliers", getResources().getDrawable(R.drawable.cavaliers)));
        cosas.add(new Equipo("Charlotte Hornets", getResources().getDrawable(R.drawable.hornets)));
        cosas.add(new Equipo("New York Knicks", getResources().getDrawable(R.drawable.knicks)));
        cosas.add(new Equipo("Detroit Pistons", getResources().getDrawable(R.drawable.pistons)));
        cosas.add(new Equipo("Miami Heat", getResources().getDrawable(R.drawable.heat)));
        cosas.add(new Equipo("Philadelphia 76ers", getResources().getDrawable(R.drawable.philadelphia)));
        cosas.add(new Equipo("Indiana Pacers", getResources().getDrawable(R.drawable.pacers)));
        cosas.add(new Equipo("Orlando Magic", getResources().getDrawable(R.drawable.magic)));
        cosas.add(new Equipo("Toronto Raptors", getResources().getDrawable(R.drawable.raptors)));
        cosas.add(new Equipo("Milwaukee Bucks", getResources().getDrawable(R.drawable.bucks)));
        cosas.add(new Equipo("Washington Wizards", getResources().getDrawable(R.drawable.wizards)));
        cosas.add(new Equipo("Denver Nuggets", getResources().getDrawable(R.drawable.nuggets)));
        cosas.add(new Equipo("Golden State Warriors", getResources().getDrawable(R.drawable.warriors)));
        cosas.add(new Equipo("Dallas Mavericks", getResources().getDrawable(R.drawable.mavericks)));
        cosas.add(new Equipo("Minnesota TimberWolves", getResources().getDrawable(R.drawable.timberwolves)));
        cosas.add(new Equipo("LA Clippers", getResources().getDrawable(R.drawable.clippers)));
        cosas.add(new Equipo("Oklahoma City Thunders", getResources().getDrawable(R.drawable.thunder)));
        cosas.add(new Equipo("Houston Rockets", getResources().getDrawable(R.drawable.rockets)));
        cosas.add(new Equipo("LA Lakers", getResources().getDrawable(R.drawable.lakers)));
        cosas.add(new Equipo("Memphis Grizzlies", getResources().getDrawable(R.drawable.grizzlies)));
        cosas.add(new Equipo("Portland Trail Blazers", getResources().getDrawable(R.drawable.blazers)));
        cosas.add(new Equipo("Phoenix Suns", getResources().getDrawable(R.drawable.suns)));
        cosas.add(new Equipo("New Orleans Pelicans", getResources().getDrawable(R.drawable.pelicans)));
        cosas.add(new Equipo("Utah Jazz", getResources().getDrawable(R.drawable.jazz)));
        cosas.add(new Equipo("Sacramento Kings", getResources().getDrawable(R.drawable.kings)));
        cosas.add(new Equipo("San Antonio Spurs", getResources().getDrawable(R.drawable.spurs)));

        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        //lista = (ListView) findViewById(android.R.id.list);
        miArrayAdapter adap = new miArrayAdapter(this,fila,R.id.nombreEquipo,cosas);
        //adap.setDropDownViewResource(R.layout.fila);
        spin.setAdapter(adap);
        imagen = (ImageView) findViewById(R.id.imagenCentral);
        //lista.setAdapter(adap);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent,
                               View v, int position, long id) {
        imagen.setImageDrawable(cosas.get(position).getEscudo());
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //selection.setText("");
    }
}
