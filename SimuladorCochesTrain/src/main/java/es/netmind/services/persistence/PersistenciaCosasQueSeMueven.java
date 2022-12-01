package es.netmind.services.persistence;

import es.netmind.models.CosaQueAvanza;

public class PersistenciaCosasQueSeMueven {
    static public boolean guardarCosa(CosaQueAvanza cosa) {

        try {
            // intentamos almacenar en bbdd
            return true;
        } catch (Exception e) {
            return false;
        }


    }
}
