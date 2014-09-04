package delfiinipeli.logiikka;

import java.util.ArrayList;
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
        peli = new Peli(1050, 650);
    }

    @After
    public void tearDown() {
    }


//    MITEN?!?!?!?!?!?!?!?!
//    @Test
//    public void RandomYAntaaOikealtaValiltaArvonPallojaLuodessa() {
//        
//
//    }
//    @Test
//    public void RandomNopeusAntaaArvonOikealtaValilta() {
//        
//    }

    
    
    @Test
    public void getLaskuriPalauttaaLaskurin() {
        peli.getLaskuri().kasvataArvoa();
        peli.getLaskuri().kasvataArvoa();
        
        assertEquals(2, peli.getLaskuri().getArvo());
    }
    
// ei voida testaa, ennenkuin tiedetään delfiini.osuuko-metodin toiminnasta..???
    // et voi muutenkaan tehdä näin, sillä eihän laskurin arvo kasva, jos delfiini ei osu palloon!!
//    @Test
//    public void laskurinArvoKasvaaMetodiKasvattaaArvoa() {
//        peli.laskurinArvoKasvaa();
//        
//        assertEquals(1, peli.getLaskuri().getArvo());
//    }
}
