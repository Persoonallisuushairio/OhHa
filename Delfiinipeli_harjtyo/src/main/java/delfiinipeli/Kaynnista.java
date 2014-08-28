package delfiinipeli;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Hahmo;
import delfiinipeli.mallit.Pallo;
import delfiinipeli.logiikka.*;
import delfiinipeli.kayttoliittyma.*;
import java.awt.Color;
import javax.swing.SwingUtilities;
import java.util.ArrayList;

public class Kaynnista {

    public static void main(String[] args) {
        ArrayList<Pallo> poimittavat = new ArrayList<Pallo>();
        ArrayList<Pallo> vaistettavat = new ArrayList<Pallo>();
  
  
        Delfiini flipper = new Delfiini(50, 50, 30);
        Pallo pallonen = new Pallo(100, 150, 25, Color.BLUE);
        Pallo pallonen2 = new Pallo(150, 250, 25, Color.RED);
        Pallo pallonen3 = new Pallo(250, 300, 25, Color.YELLOW);

        poimittavat.add(pallonen);
        poimittavat.add(pallonen2);
        poimittavat.add(pallonen3);
   
        
        Peli peli = new Peli(flipper, vaistettavat, poimittavat);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(peli, new Piirtoalusta(flipper, vaistettavat, poimittavat));
        SwingUtilities.invokeLater(kayttoliittyma);
    }
// public ArrayList<Hahmo> luoPallot(int lukumaara) {
// int x = 0;
// ArrayList<Hahmo> pallot = new ArrayList<Hahmo>();
//
// while (lukumaara <= x) {
// if (lukumaara % 2 == 0) {
// Poimittavapallo pallonen = new Poimittavapallo(100,100,50,50);
// } else if (lukumaara % 2 == -1 || lukumaara % 2 == 1) {
// Vaistettavapallo pallo = new Vaistettavapallo(100,100,50,50);
// }
// x++;
// }
// return pallot;
// }
}
