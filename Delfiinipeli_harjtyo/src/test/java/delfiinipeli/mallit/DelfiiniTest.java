package delfiinipeli.mallit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DelfiiniTest {

    Delfiini d;

    public DelfiiniTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        d = new Delfiini(100, 100);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pallonTyyppiPalauttaaVaistettavan() {
        assertEquals(25, d.pallonTyyppi(new Pallo(1050, 150, 2.0f, 25, true)));
    }

    @Test
    public void pallonTyyppiPalauttaaPoimittavan() {
        assertEquals(35, d.pallonTyyppi(new Pallo(1050, 150, 2.0f, 25, false)));
    }

    @Test
    public void osuukoMetodiPalauttaaTrue() {
        Pallo pallo = new Pallo(100, 100, 2.0f, 25, true);
        assertTrue(d.osuuko(pallo));
    }

    @Test
    public void osuukoMetodiPalauttaaFalse() {
        Pallo pallo = new Pallo(1000, 1000, 2.0f, 25, false);
        assertFalse(d.osuuko(pallo));
    }

}
