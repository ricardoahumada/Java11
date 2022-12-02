package es.netmind.persistence;

import es.netmind.models.CosaQueAvanza;

public interface IPersistenciaCosasQueSeMueven {
    public boolean guardarCosa(CosaQueAvanza cosa) throws Exception;
}
