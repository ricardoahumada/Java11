package es.netmind.persistence;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersistenciaCosasQueSeMuevenTest {

    @Test
    public void getCosas() {
        PersistenciaCosasQueSeMueven pcqm = PersistenciaCosasQueSeMueven.getInstance();
        int init_size = pcqm.getCosas().size();
        assertEquals(0, init_size);
    }

    @Test
    public void eliminarCosa() {
    }

    @Test
    public void guardarCosa() {
    }


}