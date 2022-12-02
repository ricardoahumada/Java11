package es.netmind.services;

import es.netmind.models.CosaQueAvanza;
import es.netmind.persistence.PersistenciaCosasQueSeMueven;
import es.netmind.utils.Sorter;

import java.util.List;
import java.util.ListIterator;

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

    static public CosaQueAvanza encontrar_mas_rapido(List<CosaQueAvanza> cosas) {
        double[] tiempos = new double[cosas.size()];
        for (int i = 0; i < cosas.size(); i++) {
            CosaQueAvanza cosa = cosas.get(i);
            cosa.iniciar();
            tiempos[i] = cosa.avanzar(100);
            cosa.parar();
        }

        /*for (CosaQueAvanza cqa : cosas) {
            System.out.println("cqa:" + cqa);
        }

        ListIterator<CosaQueAvanza> iterator = cosas.listIterator();
        while (iterator.hasNext()) {
            System.out.println("cqa it:" + iterator.next());
        }*/

        int index_cosa = Sorter.encontrar_mas_rapido(tiempos);

        if(index_cosa>=0) return cosas.get(index_cosa);
        else return null;
    }

    static public boolean guardarCosa(String clave, CosaQueAvanza cosa) throws NullPointerException, Exception {
        if (cosa != null) return PersistenciaCosasQueSeMueven.getInstance().guardarCosa(clave,cosa);
        else throw new NullPointerException("Valores nulos");
    }

    static public boolean borrarCosa(String clave) {
        return PersistenciaCosasQueSeMueven.getInstance().eliminarCosa(clave);
    }
}
