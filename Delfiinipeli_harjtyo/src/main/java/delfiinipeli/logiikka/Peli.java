package delfiinipeli.logiikka;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Pallo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Peli {

    private final Delfiini delfiini;
    private final ArrayList<Pallo> vaistettavat;
    private final ArrayList<Pallo> poimittavat;
    private Random r;
    private Pistelaskuri pisteet;
    private boolean osuuVaistettavaan;

    public Peli() {
        delfiini = new Delfiini(50, 50, 30);
        poimittavat = new ArrayList<Pallo>();
        vaistettavat = new ArrayList<Pallo>();
        pisteet = new Pistelaskuri();
        osuuVaistettavaan = false;
        r = new Random();
    }

    public void luoPallot(int ikkunanLeveys, int ikkunanKorkeus) {

        for (int i = 0; i < 20; ++i) {
            int y = r.nextInt(ikkunanKorkeus);
            float nopeus = r.nextFloat() * 9.0f + 1.0f;
            int sade = 25;
            if (i % 2 == 0) {
                Pallo p = new Pallo(ikkunanLeveys, y, nopeus, sade, Color.BLUE);
                poimittavat.add(p);
            } else {
                Pallo v = new Pallo(ikkunanLeveys, y, nopeus, sade, Color.RED);
                vaistettavat.add(v);

            }
        }
    }
//    

    public Delfiini getDelfiini() {
        return this.delfiini;
    }

    public ArrayList<Pallo> getVaistettavat() {
        return this.vaistettavat;
    }

    public ArrayList<Pallo> getPoimittavat() {
        return this.poimittavat;
    }

    public void pallojenLiike() {
        for (Pallo p : poimittavat) {
            if (!delfiini.osuuko(p) && p.getX() > 0) {
                p.liikuta(-1, 0);
            } else {
                laskurinArvoKasvaa();
                p.setX(1050);
                p.setY(r.nextInt(650));
                p.setNopeus(r.nextFloat() * 9.0f + 1.0f);
            }
        }
        for (Pallo v : vaistettavat) {
            if (v.getX() > 0) {
                v.liikuta(-1, 0);
            } else {
                v.setX(1050);
                v.setY(r.nextInt(650));
                v.setNopeus(r.nextFloat() * 9.0f + 1.0f);
            }
        }
    }
    public void pallotRandomisti() {
        
    }

    public void laskurinArvoKasvaa() {
        for (Pallo p : poimittavat) {
            if (delfiini.osuuko(p)) {
                pisteet.kasvataArvoa();
                System.out.println(pisteet.getArvo());
            }
        }
    }

    public Pistelaskuri getLaskuri() {
        return this.pisteet;
    }

//    public void pallojenUudelleenPiirto() {
//      for(Pallo p : poimittavat) {
//          if (!p.hahmoPysyyRuudussa(xmuutos, ymuutos, leveys, korkeus))
//      }
//    }
}
