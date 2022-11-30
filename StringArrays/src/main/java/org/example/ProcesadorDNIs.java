package org.example;

public class ProcesadorDNIs {

    private String valor_dni = "";

    public ProcesadorDNIs() {
    }
    public ProcesadorDNIs(String valor) {
        if ( validate_dni(valor) ) {
            this.valor_dni = valor;
        }
    }

    public String getValor_dni() {
        return aMayusculas();
    }

    public void setValor_dni(String valor) {
        boolean is_valid = validate_dni(valor);
        if (!is_valid) {
            //
        } else {
            this.valor_dni = valor;
        }
    }

    public String aMayusculas() {
        return valor_dni.toUpperCase();
    }

    public void reemplazar(char inicial, char reemplazo) {
        valor_dni = valor_dni.replace(inicial, reemplazo);
    }

    private boolean validate_dni(String valor) {
        boolean isok = (valor.length() == 9);
        return isok;
    }

    @Override
    public String toString() {
        return "ProcesadorDNIs{" +
                "valor_dni='" + valor_dni + '\'' +
                '}';
    }
}
