package com.ejercicio.herencias;

import com.ejercicio.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String tipeSim;

    public SmartPhone(String marca, String modelo, int precio, int year, String tipeSim) {
        super(marca, modelo, precio, year);
        this.tipeSim = tipeSim;
    }
}
