package es.netmind.persistence;

import es.netmind.models.CosaQueAvanza;

public interface IPersistenciaCosasQueSeMueven {
    public boolean guardarCosa(String clave, CosaQueAvanza cosa) throws Exception;
}
