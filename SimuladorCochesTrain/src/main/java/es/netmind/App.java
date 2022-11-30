package es.netmind;

import es.netmind.models.Coche;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando la simulación ...");

        Coche renault = new Coche("Renault", "berlina", 120);
        System.out.println(renault);
        renault.encender();
        double t_renault = renault.avanzar(100);
        System.out.println(renault + "::" + t_renault);
        renault.parar();

        System.out.println("Fin de la simulación!!");
    }
}
