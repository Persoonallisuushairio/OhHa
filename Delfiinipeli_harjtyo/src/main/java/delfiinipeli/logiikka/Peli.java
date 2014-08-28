package delfiinipeli.logiikka;

import delfiinipeli.kayttoliittyma.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Peli {

    private Hahmo delfiini;
    private ArrayList<VaistettavatPallot> vaistettavat;
    private ArrayList<PoimittavatPallot> poimittavat;

    public Peli(Delfiini delfiini, ArrayList<VaistettavatPallot> vaistettavat, 
            ArrayList<PoimittavatPallot> kerattavat) {
        this.delfiini = delfiini;
    }
    
    public Hahmo getDelfiini() {
        return this.delfiini;
    }
    
    public ArrayList<VaistettavatPallot> getVaistettavat() {
        return this.vaistettavat;
    }
    
    public ArrayList<PoimittavatPallot> getPoimittavat() {
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
