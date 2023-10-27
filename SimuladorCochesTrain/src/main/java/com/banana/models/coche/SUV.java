package com.banana.models.coche;

public class SUV extends Coche  {
    public int num_marchas = 0;
    public int traccion = 1;

    public SUV(String marca, String tipo, int velocidad) {
        super(marca, tipo, velocidad);
    }

    public SUV(String marca, String tipo, int velocidad, int num_marchas) {
        super(marca, tipo, velocidad);
        this.num_marchas = num_marchas;
    }

    @Override
    public double avanzar(int kms) {
        if (this.traccion == 1) return super.avanzar(kms) * 0.95;
        else return super.avanzar(kms) * 0.85;
    }

    public boolean cambiar_traccion() {
        if (this.traccion == 1) this.traccion = 2;
        else this.traccion = 1;
        return true;
    }
}
