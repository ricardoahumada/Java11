package org.example;

public class ProcesadorDNIs {

    private String valor_dni ="";

    public String aMayusculas(){
        return valor_dni.toUpperCase();
    }

    public void reemplazar(char inicial,char reemplazo){
        valor_dni = valor_dni.replace(inicial, reemplazo);
    }

}
