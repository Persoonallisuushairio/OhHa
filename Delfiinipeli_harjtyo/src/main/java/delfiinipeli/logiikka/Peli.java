package delfiinipeli.logiikka;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Pallo;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

public class Peli {

    private final Delfiini delfiini;
    private final ArrayList<Pallo> pallot;
    private Random r;
    private Pistelaskuri pisteet;
    private boolean osunutVaistettavaan;
    private int pallojaOhi;
    private int ikkunanLeveys;
    private int ikkunanKorkeus;
    private float nopeusLisa;

    public Peli(int ikkunanLeveys, int ikkunanKorkeus) {
        this.ikkunanLeveys = ikkunanLeveys;
        this.ikkunanKorkeus = ikkunanKorkeus;
        
        r = new Random();
        delfiini = new Delfiini(50, 50);
        pisteet = new Pistelaskuri();
        
        pallot = new ArrayList<>();
        luoPallot();
        
        osunutVaistettavaan = false;
        pallojaOhi = 0;
    }
    private void luoPallot() {
        for (int i = 0; i < 20; ++i) {
            int y = r.nextInt(ikkunanKorkeus);
            float nopeus = r.nextFloat() * 5.0f + nopeusLisa;
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
                pallojaOhi++;
                
                if(pallojaOhi == 20) {
                    nopeusLisa = nopeusLisa + 2.5f;
                    pallojaOhi = 0;
                }
                
                nollaaPallo(p);
            }

            if (delfiini.osuuko(p)) {
                if (p.onkoVaistettava()) {
                    this.osunutVaistettavaan = true;
                } else {
                    pisteet.kasvataArvoa();
                    nollaaPallo(p);
                }
            }
        }
    }

    private void nollaaPallo(Pallo p) {
        p.setX(ikkunanLeveys);
        p.setY(r.nextInt(ikkunanKorkeus));
        p.setNopeus(r.nextFloat() * 5.0f + nopeusLisa);
    }
       
    public Pistelaskuri getLaskuri() {
        return this.pisteet;
    }

    public void aloita() {
        this.nopeusLisa = 5.0f;
        this.osunutVaistettavaan = false;
        
        for(Pallo p : pallot) {
            nollaaPallo(p);
        }
    }
    
    public boolean onkoOsunutVaistettavaan() {
        return this.osunutVaistettavaan;
    }
}


