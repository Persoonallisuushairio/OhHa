package delfiinipeli;

import delfiinipeli.logiikka.*;
import delfiinipeli.kayttoliittyma.*;
import javax.swing.SwingUtilities;
import java.util.ArrayList;

public class Kaynnista {

    public static void main(String[] args) {
        ArrayList<PoimittavatPallot> poimittavat = new ArrayList<PoimittavatPallot>();
        ArrayList<VaistettavatPallot> vaistettavat = new ArrayList<VaistettavatPallot>();
        
//        ArrayList<Hahmo> kaikkiPelihahmot = new ArrayList<Hahmo>();
        
        
        Delfiini flipper = new Delfiini(100, 250, 65, 65);
        PoimittavatPallot pallonen = new PoimittavatPallot(100, 100, 50, 50);
        PoimittavatPallot pallonen2 = new PoimittavatPallot(100, 100, 50, 50);
        PoimittavatPallot pallonen3 = new PoimittavatPallot(100, 100, 50, 50);
        
//        kaikkiPelihahmot.add(flipper);
//        kaikkiPelihahmot.add(pallonen);
        poimittavat.add(pallonen);
        
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
