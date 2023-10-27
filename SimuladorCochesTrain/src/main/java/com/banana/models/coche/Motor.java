package com.banana.models.coche;

public class Motor {
    private int cv;
    private String tipo;
    private int estado=1;

    public Motor(int cv, String tipo) {
        this.cv = cv;
        this.tipo = tipo;
    }

    public void arrancar(){
        this.estado=2;
    }

    public void apagar(){
        this.estado=1;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cv=" + cv +
                ", tipo='" + tipo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
