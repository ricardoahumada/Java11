package com.banana;

import com.banana.models.*;
import com.banana.models.coche.*;
import com.banana.services.ServicioCosasQueAvanzan;
import com.banana.utils.Sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

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
        List<CosaQueAvanza> listaCosasQueAvanzan = ServicioCosasQueAvanzan.dameLista();
        System.out.println("listaCosasQueAvanzan:" + listaCosasQueAvanzan);

        listaCosasQueAvanzan.forEach(
                (elem) -> {
                    System.out.println("Lambda show cosa:" + elem);
                }
        );

        System.out.println("\n-----------------------------\n");
        System.out.println("calculabdo....");
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
