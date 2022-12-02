package es.netmind.persistence;

import es.netmind.models.Caballo;
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
    public void procesoDeAddCosa() {
        //obtego la persistencia
        PersistenciaCosasQueSeMueven pcqm = PersistenciaCosasQueSeMueven.getInstance();
        //valido tamaño inicial
        int init_size = pcqm.getCosas().size();
        assertEquals(0, init_size);
        //añado elemento
        try {
            pcqm.guardarCosa("nuevo", new Caballo());
            int new_size = pcqm.getCosas().size();
            //valido tamaño final
            assertEquals(1, new_size);
        } catch (Exception exception) {
            System.out.println("Error:" + exception);
            assertTrue(true);
        }
    }

    @Test
    public void procesoDeAddCosaNull() {
        //obtego la persistencia
        PersistenciaCosasQueSeMueven pcqm = PersistenciaCosasQueSeMueven.getInstance();
        //valido tamaño inicial
        int init_size = pcqm.getCosas().size();
        assertEquals(0, init_size);
        //añado elemento
        try {
            pcqm.guardarCosa("nuevo", null);
            int new_size = pcqm.getCosas().size();
            //valido tamaño final
            assertTrue(false);
        } catch (Exception exception) {
            System.out.println("Error:" + exception);
            assertTrue(true);
        }
    }

    @Test
    public void eliminarCosa() {
    }

    @Test
    public void guardarCosa() {
    }


}