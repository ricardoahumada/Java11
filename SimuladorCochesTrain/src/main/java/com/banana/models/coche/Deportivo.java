package com.banana.models.coche;

public class Deportivo extends Coche{
    private int cv = 0;

    public Deportivo(String marca, String tipo, int velocidad,int cv) {
        super(marca, tipo, velocidad);
        this.cv=cv;
    }

    @Override
    public double avanzar(int kms) {
        return super.avanzar(kms) * cv / 100;
    }


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
