package es.netmind;

import es.netmind.models.Coche;
import es.netmind.models.SUV;
import es.netmind.utils.Sorter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando la simulación ...");


        Coche[] coches = new Coche[]{
                new Coche("Renault", "berlina", 120),
                new SUV("Toyota", "suv", 110, 2),
                new Coche("Ferrari", "deportivo", 300)
        };

        double[] tiempos = new double[]{0, 0, 0};

        for (int i = 0; i < coches.length; i++) {
            Coche coche_actual = coches[i];
            coche_actual.encender();
            tiempos[i] = coche_actual.avanzar(100);
            coche_actual.parar();
        }

        SUV toyota = (SUV) coches[1];
        toyota.cambiar_traccion();
        int traccion = toyota.traccion;
        System.out.println("traccion toyota:"+traccion);

        /*SUV renault = (SUV) coches[0];
        renault.cambiar_traccion();*/


        Coche.elmasrapido = "ferrari";
        System.out.println("Ranault:" + coches[0].elmasrapido);
        System.out.println("Ferrari:" + coches[2].elmasrapido);

        System.out.println("Tiempos:" + tiempos);

        int index_coche = Sorter.encontrar_mas_rapido(tiempos);

        System.out.println("Indice más rápido:" + index_coche);
        System.out.println("Coche más rápido:" + coches[index_coche]);

        System.out.println("Fin de la simulación!!");
    }
}
