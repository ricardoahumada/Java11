package com.banana.utils;

public class Sorter {

    static final public double PI = 3.14;

    static public int encontrar_mas_rapido(double[] tiempos) {
        double min_tiempo = Integer.MAX_VALUE;
        int index_coche = -1;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] < min_tiempo) {
                min_tiempo = tiempos[i];
                index_coche = i;
            }
        }

        return index_coche;
    }



}
