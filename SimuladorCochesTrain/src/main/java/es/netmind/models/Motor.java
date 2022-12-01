package es.netmind.models;

public class Motor {
    private int cv;
    private String tipo;
    private int estado;

    public Motor(int cv) {
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
