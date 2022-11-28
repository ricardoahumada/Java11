package org.example;

public class Operaciones {

    public String ultima_operacion="";

    public int sumar(int x, int y){
        int z=x+y;
        ultima_operacion="sumar";
        return z;
    }

    public  double div(int x, int y){
        ultima_operacion="div";
        return x/y;
    }

    public double resto(int x, int y){
        ultima_operacion="resto";
        return x%y;
    }

}
