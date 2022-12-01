package es.netmind;

import es.netmind.models.*;
import es.netmind.models.coche.*;
import es.netmind.services.ServicioCosasQueAvanzan;
import es.netmind.utils.Sorter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /** Usando Herencia **/

        /*System.out.println("Iniciando la simulación ...");


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

        toyota.setMotor(new Motor(200,"gas"));
        System.out.println("Motor toyota: " + toyota.getMotor());
        System.out.println("Motor toyota cvs: " + toyota.getMotor().getCv());

        Coche.elmasrapido = "ferrari";
        System.out.println("Ranault:" + coches[0].elmasrapido);
        System.out.println("Ferrari:" + coches[2].elmasrapido);

        System.out.println("Tiempos:" + tiempos);

        int index_coche = Sorter.encontrar_mas_rapido(tiempos);

        System.out.println("Indice más rápido:" + index_coche);
        System.out.println("Coche más rápido:" + coches[index_coche]);

        System.out.println("Fin de la simulación!!");*/

        /** Usando Interfaces **/

        System.out.println("Inicio simulación CosaQueAvanza ...");

        CosaQueAvanza[] cosaQueAvanzan = new CosaQueAvanza[]{
                new Berlina("Renault", "berlina", 120, 3),
                new SUV("Toyota", "suv", 110, 2),
                new Deportivo("Ferrari", "deportivo", 300, 250),
                new Caballo()
        };

        CosaQueAvanza laCosaMasRapida= ServicioCosasQueAvanzan.encontrar_mas_rapido(cosaQueAvanzan);
        System.out.println("Cosa más rápido:" + laCosaMasRapida);

        // ...

        boolean resultado = ServicioCosasQueAvanzan.guardarCosa(null);
        System.out.println("resultado almacenaje: "+ resultado);

        System.out.println("Fin simulación CosaQueAvanza!!");

    }
}
