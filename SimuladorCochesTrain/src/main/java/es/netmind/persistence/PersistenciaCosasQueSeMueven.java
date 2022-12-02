package es.netmind.persistence;

import es.netmind.exceptions.MyException;
import es.netmind.models.CosaQueAvanza;

public class PersistenciaCosasQueSeMueven implements IPersistenciaCosasQueSeMueven {
    public boolean guardarCosa(CosaQueAvanza cosa) throws Exception, NullPointerException, MyException {

        try {
            // intentamos almacenar en bbdd
            return true;
        } catch (NullPointerException e) {
            // avisar a developer
            throw new NullPointerException("Valor nulo");
        } catch (Exception e) {
            // avisar a admin
            throw new Exception("BBDD rota");
        }

    }
}
