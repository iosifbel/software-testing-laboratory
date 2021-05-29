package teste;

import clase.Grupa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GrupaTest {

    //RIGHT - verificam daca obtinem rezultatul asteptat pentru input ul selectat
    @Test
    public void testConstructorRight(){
        Grupa grupa = new Grupa(1085);
        assertEquals(1085, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }
    //I - inverse relation, plecam de la rezultat si ajungem la input
    //C - cross check verificarea unei parti de cod cu alta parte testata de cod

    //E - errors trebuie simulata si fortata obtinerea de erori

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException1() {
        Grupa grupa = new Grupa(900);

    }

    @Test(timeout = 500)
    public void testConstructorPerformance() {
        Grupa grupa = new Grupa(1086);
    }

    @Test
    public void testConstructorRangeVeciniiLimitelor() {
        Grupa grupa = new Grupa(1001);
        assertEquals(1001, grupa.getNrGrupa());
        Grupa grupa2 = new Grupa(1099);
        assertEquals(1099,grupa2.getNrGrupa());

    }

    @Test
    public void testConstructorExistence() {
        Grupa grupa = new Grupa(1041);
        assertNotNull(grupa.getStudenti());
    }



}
