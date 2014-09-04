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
    public void konstruktoriAsettaaOikeinSateenJaVarin() {
        assertEquals(25, pallo.getSade());
        assertEquals(Color.GREEN, pallo.getVari());
        
        
    }
}
