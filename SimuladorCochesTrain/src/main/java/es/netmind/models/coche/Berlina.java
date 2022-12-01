package es.netmind.models.coche;

public class Berlina extends Coche {
    private int num_puertas = 4;

    public Berlina(String marca, String tipo, int velocidad, int num_puertas) {
        super(marca, tipo, velocidad);
        this.num_puertas = num_puertas;
    }

    @Override
    public double avanzar(int kms) {
        return super.avanzar(kms) * 5 / num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
}
