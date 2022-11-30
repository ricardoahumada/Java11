package es.netmind;

import es.netmind.models.Coche;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando la simulación ...");

        /*Coche renault = new Coche("Renault", "berlina", 120);
        System.out.println(renault);
        renault.encender();
        double t_renault = renault.avanzar(100);
        System.out.println(renault + "::" + t_renault);
        renault.parar();

        Coche toyota = new Coche("Toyota", "suv", 110);
        toyota.encender();
        double t_toyota = toyota.avanzar(100);
        System.out.println(toyota + "::" + t_toyota);
        toyota.parar();

        Coche ferrari = new Coche("Ferrari", "deportivo", 300);
        ferrari.encender();
        double t_ferrari = ferrari.avanzar(100);
        System.out.println(ferrari + "::" + t_ferrari);
        ferrari.parar();

        if (t_renault < t_ferrari && t_renault < t_toyota) {
            System.out.println("El ganador es Renault");
        } else if (t_toyota < t_renault && t_toyota < t_ferrari) {
            System.out.println("El ganador es Toyota");
        } else if (t_ferrari < t_renault && t_ferrari < t_toyota) {
            System.out.println("El más rápido es Ferrari");
        }*/

        Coche[] coches = new Coche[]{
                new Coche("Renault", "berlina", 120),
                new Coche("Toyota", "suv", 110),
                new Coche("Ferrari", "deportivo", 300)
        };

        double[] tiempos = new double[]{0, 0, 0};

        for (int i = 0; i < coches.length; i++) {
            Coche coche_actual = coches[i];
            coche_actual.encender();
            tiempos[i] = coche_actual.avanzar(100);
            coche_actual.parar();
        }

        System.out.println("Tiempos:" + tiempos);

        double min_tiempo = Integer.MAX_VALUE;
        int index_coche = -1;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] < min_tiempo) {
                min_tiempo = tiempos[i];
                index_coche = i;
            }
        }

        System.out.println("Indice más ráido:" + index_coche);
        System.out.println("Coche más ráido:" + coches[index_coche]);

        System.out.println("Fin de la simulación!!");
    }
}
