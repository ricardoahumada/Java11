package es.netmind;

import es.netmind.models.*;
import es.netmind.utils.Sorter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /** Usando Herencia **/

        System.out.println("Iniciando la simulación ...");


        Coche[] coches = new Coche[]{
                new Berlina("Renault", "berlina", 120, 3),
                new SUV("Toyota", "suv", 110, 2),
                new Deportivo("Ferrari", "deportivo", 300, 250)
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
        System.out.println("traccion toyota cvs:" + traccion);

        toyota.setMotor(new Motor(200));
        System.out.println("Motor toyota" + toyota.getMotor().getCv());

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

        /** Usando Interfaces **/

        System.out.println("Inicio simulación CosaQueAvanza ...");

        CosaQueAvanza[] cosaQueAvanzan = new CosaQueAvanza[]{
                new Berlina("Renault", "berlina", 120, 3),
                new SUV("Toyota", "suv", 110, 2),
                new Deportivo("Ferrari", "deportivo", 300, 250),
                new Caballo()
        };

        tiempos = new double[cosaQueAvanzan.length];
        for (int i = 0; i < cosaQueAvanzan.length; i++) {
            CosaQueAvanza cosa = cosaQueAvanzan[i];
            cosa.iniciar();
            tiempos[i] = cosa.avanzar(100);
            cosa.parar();
        }

        int index_cosa = Sorter.encontrar_mas_rapido(tiempos);
        System.out.println("Indice más rápido:" + index_cosa);
        System.out.println("Cosa más rápido:" + cosaQueAvanzan[index_cosa]);

        System.out.println("Fin simulación CosaQueAvanza!!");

    }
}
