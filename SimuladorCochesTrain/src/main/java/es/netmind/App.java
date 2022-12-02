package es.netmind;

import es.netmind.models.*;
import es.netmind.models.coche.*;
import es.netmind.services.ServicioCosasQueAvanzan;
import es.netmind.utils.Sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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

        System.out.println("Inicio simulación CosaQueAvanza ...\n");

        CosaQueAvanza[] cosaQueAvanzan = new CosaQueAvanza[]{
                new Berlina("Renault", "berlina", 120, 3),
                new SUV("Toyota", "suv", 110, 2),
                new Deportivo("Ferrari", "deportivo", 300, 250),
                new Caballo()
        };

        CosaQueAvanza laCosaMasRapida = ServicioCosasQueAvanzan.encontrar_mas_rapido(cosaQueAvanzan);
        // System.out.println("Cosa más rápido:" + laCosaMasRapida);

        System.out.println("\n-----------------------------\n");

        System.out.println("cargando datos en bbdd....");

        try {
            ServicioCosasQueAvanzan.guardarCosa("renault", cosaQueAvanzan[0]);
            ServicioCosasQueAvanzan.guardarCosa("toyota", cosaQueAvanzan[1]);
            ServicioCosasQueAvanzan.guardarCosa("ferrari", cosaQueAvanzan[2]);
            ServicioCosasQueAvanzan.guardarCosa("caballo", cosaQueAvanzan[3]);
        } catch (NullPointerException e) {
            System.out.println("ERROR: La cosa debe tener valores");
        } catch (Exception e) {
            System.out.println("Oppss: tenemos problemas en el sistema...intentalo más tarde, please");
        }

        System.out.println("\n-----------------------------\n");

        System.out.println("obteniendo datos de bbdd para simulación....");
        List<CosaQueAvanza> listaCosasQueAvanzan = new ArrayList();

        System.out.println("\n-----------------------------\n");
        System.out.println("claculabdo....");
        CosaQueAvanza laCosaMasRapidaList = ServicioCosasQueAvanzan.encontrar_mas_rapido(listaCosasQueAvanzan);
        System.out.println("Cosa más rápida list:" + laCosaMasRapidaList);

        System.out.println("\n-----------------------------\n");


        try {
            boolean resultado = ServicioCosasQueAvanzan.guardarCosa("seat", new Berlina("seat", "berlina", 120, 3));
            if (resultado) System.out.println("Se ha almacenado la cosa :-)");
            else System.out.println("NO se ha almacenado la cosa :-(");
        } catch (NullPointerException e) {
            System.out.println("ERROR: La cosa debe tener valores");
        } catch (Exception e) {
            System.out.println("Oppss: tenemos problemas en el sistema...intentalo más tarde, please");
        }

        System.out.println("\n-----------------------------\n");

        boolean res_borrar = ServicioCosasQueAvanzan.borrarCosa("ferrari");

        System.out.println("\nFin simulación CosaQueAvanza!!");

    }
}
