package com.example.jajimenez.spinners;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/**
 * Created by jajimenez on 20/10/16.
 */

public class Equipo {
    private String nombre;
    private Drawable escudo;

    public Equipo(String nombre, Drawable escudo){
        this.nombre=nombre;
        this.escudo=escudo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEscudo(Drawable escudo){
        this.escudo=escudo;
    }
    public Drawable getEscudo(){
        return this.escudo;
    }
    @Override
    public String toString (){
        return nombre;
    }
}
