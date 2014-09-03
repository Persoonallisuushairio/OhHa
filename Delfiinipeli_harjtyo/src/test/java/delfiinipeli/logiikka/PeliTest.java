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
        peli = new Peli();
    }

    @After
    public void tearDown() {
    }


    
    @Test
    public void luoPallotToimii() {

    }

    @Test
    public void laskurinArvoKasvaaMetodiKasvattaaArvoa() {
        peli.laskurinArvoKasvaa();
        assertEquals(1, peli.getLaskuri().getArvo());
    }
}
