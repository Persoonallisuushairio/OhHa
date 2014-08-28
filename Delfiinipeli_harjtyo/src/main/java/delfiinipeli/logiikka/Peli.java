package delfiinipeli.logiikka;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Hahmo;
import delfiinipeli.mallit.Pallo;
import java.util.ArrayList;

public class Peli {

    private final Delfiini delfiini;
    private final ArrayList<Pallo> vaistettavat;
    private final ArrayList<Pallo> poimittavat;

    public Peli(Delfiini delfiini,
            ArrayList<Pallo> vaistettavat, 
            ArrayList<Pallo> poimittavat) {
        this.delfiini = delfiini;
        this.vaistettavat = vaistettavat;
        this.poimittavat = poimittavat;
    }
    
    public Delfiini getDelfiini() {
        return this.delfiini;
    }
    
    public ArrayList<Pallo> getVaistettavat() {
        return this.vaistettavat;
    }
    
    public ArrayList<Pallo> getPoimittavat() {
        return this.poimittavat;
    }

//    public Hahmo getDelfiini() {
//        for (Hahmo hahmonen : pelihahmot) {
//            if (hahmonen.getClass().equals(delfiinipeli.logiikka.Delfiini.class)) {
//// System.out.println(hahmonen.getLeveys()); testikäyttöön, lopputulos: metodi palauttaa oikean hahmon (delfiinin leveys 65)
//                return hahmonen;
//           }  
//        }
//        return new PoimittavatPallot(0, 0, 0, 0);
//    }
    // metodi tullut hyödyttömäksi kiitos refaktoroinnin!!
    //--------------------------------------------------------------------
//    public ArrayList<Hahmo> getKaikkiHahmot() {
//// System.out.println(pelihahmot);
//        return pelihahmot;
//    }

    public void pallojenLiike() {
    }
}
