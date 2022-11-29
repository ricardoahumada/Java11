package org.example;

public class ProcesadorArrays {

    public ProcesadorDNIs[] lista_dnis=null;

    public ProcesadorArrays(ProcesadorDNIs p1, ProcesadorDNIs p2, ProcesadorDNIs p3 ) {
        this.lista_dnis=new ProcesadorDNIs[3];
        this.lista_dnis[0]=p1;
        this.lista_dnis[1]=p2;
        this.lista_dnis[2]=p3;
    }

}
