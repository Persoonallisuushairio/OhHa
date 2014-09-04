package delfiinipeli.mallit;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalloTest {
    
    Pallo pallo;
    
    public PalloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pallo = new Pallo(1050, 150, 2.0f, 25, true);
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public void konstruktoriAsettaaOikeinSateen() {
        assertEquals(25, pallo.getSade());
    }
    @Test
    public void onkoVaistettavaPalauttaaTrue() {
        assertTrue(pallo.onkoVaistettava());
    }
    @Test
    public void onkoVaistettavaPalauttaaFalse() {
        Pallo pallo2 = new Pallo(1050, 150, 2.0f, 25, false);
        assertFalse(pallo2.onkoVaistettava());
    }
    @Test
    public void setVaistettavaMuuttaaTruenFalseksiJaPallonSiniseksi() {
       pallo.setVaistettava(false);
       assertFalse(pallo.onkoVaistettava());
       assertEquals(Color.BLUE, pallo.getVari());
    }
    
}
