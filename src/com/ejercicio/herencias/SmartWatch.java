package com.ejercicio.herencias;

import com.ejercicio.clases.SmartDevice;

public class SmartWatch extends SmartDevice{

    public boolean diseñoDeportivo;

    public SmartWatch(String marca, String modelo, int precio, int year, boolean diseñoDeportivo) {
        super(marca, modelo, precio, year);
        this.diseñoDeportivo = diseñoDeportivo;
    }
}
