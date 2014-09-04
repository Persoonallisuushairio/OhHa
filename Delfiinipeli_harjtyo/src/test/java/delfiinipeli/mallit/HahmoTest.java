package delfiinipeli.mallit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HahmoTest {
    
    Hahmo hahmo;

    public HahmoTest() {  
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        hahmo = new Hahmo(100, 90, 2.0f);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void KonstruktoriAsettaaArvotOikein() {
        assertEquals(100, hahmo.getX());
        assertEquals(90, hahmo.getY());
        assertEquals(2.0f, hahmo.getNopeus(), 0.0);
    }
    @Test
    public void liikutaMetodiMuuttaaXjaYPositiivisellaLuvulla() {
        hahmo.liikuta(30, 99);
        assertEquals(160, hahmo.getX());
        assertEquals(189, hahmo.getY());
    }
    @Test
    public void liikutaMetodiMuuttaaXjaYNegatiivisellaLuvulla() {
         hahmo.liikuta(-30, -100);
         assertEquals(40, hahmo.getX());
         assertEquals(-10, hahmo.getY());
    }
    @Test
    public void hahmoPysyyRuudussaRajaArvoillaTrue() {
        //true, kun väitetään, että 1049 < 1050 ja 649 < 650
        assertTrue(hahmo.hahmoPysyyRuudussa(949, 559, 1050, 650));
    }

    @Test
    public void hahmoPysyyRuudussaRajaArvoillaFalse() {
        //false, kun väitetään, että 1050 < 1050 ja 650 < 650
        assertFalse(hahmo.hahmoPysyyRuudussa(950, 560, 1050, 650));
    }
    
    @Test
    public void hahmoPysyyRuudussaMiinuksillaTrue2() {
        //true kun käytetään miinuslukuja
        assertTrue(hahmo.hahmoPysyyRuudussa(-99, -89, 1050, 650));
    }

    @Test
    public void hahmoPysyyRuudussaMiinuksillaFalse2() {
        // false, koska x + -110 = -10 || !(-10 > 0) 
        //// (huom, tässä x=100)
        assertFalse(hahmo.hahmoPysyyRuudussa(-110, 5, 1050, 650));
    }
    
    
    
}
