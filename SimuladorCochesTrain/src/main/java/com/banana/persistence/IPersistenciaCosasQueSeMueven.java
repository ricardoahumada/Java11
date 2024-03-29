package com.banana.persistence;

import com.banana.models.CosaQueAvanza;

import java.util.List;

public interface IPersistenciaCosasQueSeMueven {
    public boolean guardarCosa(String clave, CosaQueAvanza cosa) throws Exception;
    public List<CosaQueAvanza> getCosas();
}
