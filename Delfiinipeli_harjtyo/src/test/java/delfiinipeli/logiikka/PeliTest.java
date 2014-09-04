package delfiinipeli.logiikka;

import java.awt.event.KeyEvent;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class PeliTest {
    
    Peli peli;
   
    
    public PeliTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peli = new Peli(1000, 1000);
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void getLaskuriPalauttaaLaskurin() {
        peli.getLaskuri().kasvataArvoa();
        peli.getLaskuri().kasvataArvoa();
        
        assertEquals(2, peli.getLaskuri().getArvo());
    }
    @Test
    public void delfiiniLiikkuu() {
        Set<Integer> setti = new HashSet<Integer>();
        peli.setNappaimet(setti);
        peli.aloita();
        
        assertEquals(1, peli.getDelfiini().getX());
        assertEquals(500, peli.getDelfiini().getY());
        
        setti.add(KeyEvent.VK_DOWN);
        peli.delfiininLiike();
        assertEquals(1, peli.getDelfiini().getX());
        assertEquals(507, peli.getDelfiini().getY());
        
        setti.clear();
        setti.add(KeyEvent.VK_UP);
        peli.delfiininLiike();
        assertEquals(1, peli.getDelfiini().getX());
        assertEquals(500, peli.getDelfiini().getY());
        
        setti.clear();
        setti.add(KeyEvent.VK_RIGHT);
        peli.delfiininLiike();
        assertEquals(8, peli.getDelfiini().getX());
        assertEquals(500, peli.getDelfiini().getY());
        
        setti.clear();
        setti.add(KeyEvent.VK_LEFT);
        peli.delfiininLiike();
        assertEquals(1, peli.getDelfiini().getX());
        assertEquals(500, peli.getDelfiini().getY());
    }
    
}
