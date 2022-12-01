package es.netmind.services.persistence;

import es.netmind.models.CosaQueAvanza;

public class PersistenciaCosasQueSeMueven {
    static public boolean guardarCosa(CosaQueAvanza cosa) throws Exception {

        try {
            // intentamos almacenar en bbdd
            return true;
        }catch (NullPointerException e){
            // avisar a developer
            throw new NullPointerException("Valor nulo");
        } catch (Exception e) {
            // avisar a admin
            throw new Exception("BBDD rota");
        }


    }
}
