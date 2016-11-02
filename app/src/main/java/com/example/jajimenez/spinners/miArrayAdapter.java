package com.example.jajimenez.spinners;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by jajimenez on 19/10/16.
 */

public class miArrayAdapter extends ArrayAdapter<Equipo>{

    public miArrayAdapter(Context context, int fila, int texto, ArrayList<Equipo> equipos) {
        super(context, fila, texto, equipos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        //Ejemplo funcionando de array adapter propio
        /*View vista = super.getView(position,convertView,parent);
        Equipo team = (Equipo) getItem(position);
        ImageView escudo = (ImageView) vista.findViewById(R.id.escudo);
        escudo.setImageDrawable(team.getEscudo());
        TextView nombre = (TextView) vista.findViewById(R.id.nombreEquipo);
        nombre.setText(team.getNombre());
        //ImageView escudo = (ImageView) vista.findViewById(R.id.escudo);
        return vista;*/


        //Ejemplo de arrayAdapter propio con reciclado
        ViewHolder holder;
        View row = convertView;
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (row==null) {
                row = inflater.inflate(R.layout.fila, parent, false);
                ImageView imagen = (ImageView) row.findViewById(R.id.escudo);
                TextView texto = (TextView) row.findViewById(R.id.nombreEquipo);
                holder = new ViewHolder(imagen, texto);
                row.setTag(holder);
        }else{
            holder = (ViewHolder) row.getTag();
        }
        Equipo team = (Equipo) getItem(position);
        ImageView escudo = (ImageView) holder.getImagen();
        escudo.setImageDrawable(team.getEscudo());
        TextView nombre = (TextView) holder.getTexto();
        nombre.setText(team.getNombre());
        return row;
    }
    /*@Override
    public int getItemViewType(int position){
        return position%2;
    }
    public int getViewTypeCount(){
        return 2;
    }
    */
}


class ViewHolder{
    private ImageView imagen;
    private TextView texto;
    public ViewHolder(ImageView imagen, TextView texto){
        this.imagen = imagen;
        this.texto = texto;
    }
    public ViewHolder(ImageView imagen){
        this.imagen = imagen;
    }
    public ImageView getImagen() {
        return imagen;
    }
    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }
    public TextView getTexto() {
        return texto;
    }
    public void setTexto(TextView texto) {
        this.texto = texto;
    }
}
