package org.example;

import java.util.Arrays;

public class ProcesadorArrays {

    protected ProcesadorDNIs[] lista_dnis = null;

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

        if (lista_dnis != null) {
            System.out.println("ProcesadorDNIs mostrarValores:" + lista_dnis.length);
            /*for (int i = 0; i < lista_dnis.length; i++) {
                System.out.println("Valor " + i + ": " + lista_dnis[i]);
            }*/

            for (ProcesadorDNIs pdni : lista_dnis) {
                System.out.println("Valor: " + pdni);
            }

        } else {
            System.out.println("ProcesadorDNIs mostrarValores: está vacio");
        }

    }

    public void mostrarValores2() {

        try {
            System.out.println("ProcesadorDNIs mostrarValores:" + lista_dnis.length);
            for (int i = 0; i < lista_dnis.length; i++) {
                System.out.println("Valor " + i + ": " + lista_dnis[i]);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Completado!");
        }

    }

}
