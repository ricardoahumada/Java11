package es.netmind.models;

public class SUV extends Coche {
    public int num_marchas = 0;
    public int traccion = 1;

    public SUV(String marca, String tipo, int velocidad) {
        super(marca, tipo, velocidad);
    }

    @Override
    public double avanzar(int kms) {
        return super.avanzar(kms) * 0.9;
        /*if (this.encendido) {
            this.posicion += kms;

            if (this.velocidad != 0) {
                return ((double) kms / (double) this.velocidad) * 0.9;
            } else return 99999999;
        } else {
            return 0;
        }*/
    }

    public boolean cambiar_traccion() {
        if (this.traccion == 1) this.traccion = 2;
        else this.traccion = 1;
        return true;
    }
}
