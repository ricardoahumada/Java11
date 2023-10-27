package com.banana.persistence;

import com.banana.exceptions.MyException;
import com.banana.models.Caballo;
import com.banana.models.CosaQueAvanza;
import com.banana.models.coche.Berlina;
import com.banana.models.coche.Deportivo;
import com.banana.models.coche.SUV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistenciaCosasQueSeMueven implements IPersistenciaCosasQueSeMueven {

    private static Map<String, CosaQueAvanza> cojuntoCosas = new HashMap();

    private static PersistenciaCosasQueSeMueven INSTANCE;

    private PersistenciaCosasQueSeMueven() {
        /*cojuntoCosas.put("renault", new Berlina("Renault", "berlina", 120, 3));
        cojuntoCosas.put("toyota", new SUV("Toyota", "suv", 110, 2));
        cojuntoCosas.put("ferrari", new Deportivo("Ferrari", "deportivo", 300, 250));
        cojuntoCosas.put("caballo", new Caballo());*/

        System.out.println("cojuntoCosas inicial:" + cojuntoCosas.size());
    }

    public static PersistenciaCosasQueSeMueven getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PersistenciaCosasQueSeMueven();
        }
        return INSTANCE;
    }

    public boolean eliminarCosa(String clave) {
        System.out.println("eliminarCosa:" + clave);
        if (cojuntoCosas.containsKey(clave)) {
            cojuntoCosas.remove(clave);
            System.out.println("cojuntoCosas:" + cojuntoCosas.size());
            return true;
        } else return false;
    }

    public boolean guardarCosa(String clave, CosaQueAvanza cosa) throws Exception, NullPointerException, MyException {

        if (clave == null || cosa == null) throw new MyException("Valores nulos");
        try {
            cojuntoCosas.put(clave, cosa);
            System.out.println("cojuntoCosas cosa_nueva:" + cojuntoCosas.get(clave));
            System.out.println("cojuntoCosas nuevo:" + cojuntoCosas.size());
            return true;
        } catch (NullPointerException e) {
            // avisar a developer
            throw new NullPointerException("Valor nulo");
        } catch (Exception e) {
            // avisar a admin
            throw new Exception("BBDD rota");
        }

    }

    @Override
    public List<CosaQueAvanza> getCosas() {
        List<CosaQueAvanza> listofvalues = new ArrayList(cojuntoCosas.values());
        return listofvalues;
    }
}
