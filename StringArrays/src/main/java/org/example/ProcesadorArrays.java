package org.example;

import java.util.Arrays;

public class ProcesadorArrays {

    public ProcesadorDNIs[] lista_dnis = null;

    public ProcesadorArrays() {

    }

    public ProcesadorArrays(ProcesadorDNIs p1, ProcesadorDNIs p2, ProcesadorDNIs p3) {
        this.lista_dnis = new ProcesadorDNIs[3];
        this.lista_dnis[0] = p1;
        this.lista_dnis[1] = p2;
        this.lista_dnis[2] = p3;
    }

    public ProcesadorArrays(ProcesadorDNIs[] arrayPDnis) {
        this.lista_dnis = arrayPDnis;
    }

    @Override
    public String toString() {
        return "ProcesadorArrays{" +
                "lista_dnis=" + Arrays.toString(lista_dnis) +
                '}';
    }

    public void mostrarValores() {

        System.out.println("ProcesadorDNIs mostrarValores:" + lista_dnis.length);
        for (int i = 0; i < lista_dnis.length; i++) {
            System.out.println("Valor " + i + ": " + lista_dnis[i]);
        }
    }

}
