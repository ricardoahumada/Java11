package es.netmind.services;

import es.netmind.models.CosaQueAvanza;
import es.netmind.services.persistence.PersistenciaCosasQueSeMueven;
import es.netmind.utils.Sorter;

public class ServicioCosasQueAvanzan {

    static public CosaQueAvanza encontrar_mas_rapido(CosaQueAvanza[] cosas) {
        double[] tiempos = new double[cosas.length];
        for (int i = 0; i < cosas.length; i++) {
            CosaQueAvanza cosa = cosas[i];
            cosa.iniciar();
            tiempos[i] = cosa.avanzar(100);
            cosa.parar();
        }

        int index_cosa = Sorter.encontrar_mas_rapido(tiempos);

        return cosas[index_cosa];
    }

    static public boolean guardarCosa(CosaQueAvanza cosa) throws NullPointerException,Exception{
        if(cosa!=null) return PersistenciaCosasQueSeMueven.guardarCosa(cosa);
        else throw new NullPointerException("Valores nulos");
    }

}
