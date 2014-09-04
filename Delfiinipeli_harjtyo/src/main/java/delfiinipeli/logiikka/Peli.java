package delfiinipeli.logiikka;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Pallo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Peli {

    private final Delfiini delfiini;
    private final ArrayList<Pallo> pallot;
    private Random r;
    private Pistelaskuri pisteet;
    private boolean osuuVaistettavaan;

    public Peli() {
        delfiini = new Delfiini(50, 50, 55);
        pallot = new ArrayList<>();
        pisteet = new Pistelaskuri();
        osuuVaistettavaan = false;
        r = new Random();
    }

    public void luoPallot(int ikkunanLeveys, int ikkunanKorkeus) {

        for (int i = 0; i < 20; ++i) {
            int y = r.nextInt(ikkunanKorkeus);
            float nopeus = r.nextFloat() * 9.0f + 1.0f;
            int sade = 25;

            boolean vaistettava;

            if (i % 2 == 0) {
                vaistettava = true;
            } else {
                vaistettava = false;
            }

            Pallo p = new Pallo(ikkunanLeveys, y, nopeus, sade, vaistettava);
            pallot.add(p);
        }
    }
    
    public Delfiini getDelfiini() {
        return this.delfiini;
    }

    public ArrayList<Pallo> getPallot() {
        return this.pallot;
    }

    public void pallojenLiike() {
        for (Pallo p : pallot) {
            if (p.getX() > 0) {
                p.liikuta(-1, 0);
            } else {
                nollaaPallo(p);
            }

            if (delfiini.osuuko(p)) {
                if (p.onkoVaistettava()) {

                } else {
                    pisteet.kasvataArvoa();
                    nollaaPallo(p);
                    System.out.println(pisteet.getArvo());
                }
            }
        }
    }

    private void nollaaPallo(Pallo p) {
        p.setX(1050);
        p.setY(r.nextInt(650));
        p.setNopeus(r.nextFloat() * 9.0f + 1.0f);
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
