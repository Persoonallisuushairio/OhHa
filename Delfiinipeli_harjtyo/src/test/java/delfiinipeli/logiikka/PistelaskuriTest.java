package delfiinipeli.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PistelaskuriTest {
    
    Pistelaskuri pisteet;
    
    public PistelaskuriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pisteet = new Pistelaskuri();
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void ArvoAlussaNolla() {
       assertEquals(0, pisteet.getArvo());
   }
   
   @Test
   public void kasvataArvoaToimii() {
       pisteet.kasvataArvoa();
       pisteet.kasvataArvoa();
       assertEquals(2, pisteet.getArvo());
   }
   @Test
   public void toStringPalauttaaOikeanMerkkijonon() {
       for (int i = 0; i < 4; i++) {
           pisteet.kasvataArvoa();
       }
       assertEquals("Pisteet: 4", pisteet.toString());
   }
   
}
