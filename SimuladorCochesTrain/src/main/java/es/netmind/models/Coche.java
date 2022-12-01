package es.netmind.models;

public class Coche implements CosaQueAvanza{
    private String marca = null;
    private String tipo = null;
    private int velocidad = 0;
    private boolean encendido = false;
    private double posicion = 0;

    static public String elmasrapido = "";


    public Coche(String marca, String tipo, int velocidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public void encender() {
        this.encendido = true;
    }

    public void parar() {
        this.encendido = false;
    }

    @Override
    public void iniciar() {

    }


    public double avanzar(int kms) {
        if (this.encendido) {
            this.posicion += kms;

            if (this.velocidad != 0) {
                return ((double) kms / (double) this.velocidad);
            } else return 99999999;
        } else {
            return 0;
        }
    }

    /*private double penalizar() {
        if (this.tipo.equals("berlina")) return 1;
        else if (this.tipo.equals("suv")) return 0.9;
        else if (this.tipo.equals("deportivo")) return 1.1;
        else return 1;
    }*/

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", velocidad=" + velocidad +
                ", encendido=" + encendido +
                ", posicion=" + posicion +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getPosicion() {
        return posicion;
    }

    public void setPosicion(double posicion) {
        this.posicion = posicion;
    }
}
