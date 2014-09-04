package delfiinipeli.logiikka;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Pallo;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Peli {
    /*Peli luokka aloittaa pelin
    Luokassa luodaan kaikki liikkuvat pelihahmot, ja
    Hahmojen liikkeen peruspalaset tuotetaan luokassa
    */

    private final Delfiini delfiini;
    private final ArrayList<Pallo> pallot;
    private final Random r;
    private final Pistelaskuri pisteet;
    private boolean osunutVaistettavaan;
    private int pallojaOhi;
    private final int ikkunanLeveys;
    private final int ikkunanKorkeus;
    private float nopeusLisa;
    private Set<Integer> nappaimet;

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
            int sade = 25;

            boolean vaistettava;
            if (i % 2 == 0) {
                vaistettava = true;
            } else {
                vaistettava = false;
            }

            Pallo p = new Pallo(0, 0, 0, sade, vaistettava);
            pallot.add(p);
        }
    }

    public Delfiini getDelfiini() {
        return this.delfiini;
    }

    public ArrayList<Pallo> getPallot() {
        return this.pallot;
    }

    public Pistelaskuri getLaskuri() {
        return this.pisteet;
    }

    public void delfiininLiike() {
        int muutos = 5 + (int) nopeusLisa;

        if (nappaimet.contains(KeyEvent.VK_LEFT) && delfiini.hahmoPysyyRuudussa(-muutos, 0, ikkunanLeveys, ikkunanKorkeus)) {
            delfiini.liikuta(-muutos, 0);
        }

        if (nappaimet.contains(KeyEvent.VK_RIGHT) && delfiini.hahmoPysyyRuudussa(muutos, 0, ikkunanLeveys, ikkunanKorkeus)) {
            delfiini.liikuta(muutos, 0);
        }

        if (nappaimet.contains(KeyEvent.VK_UP) && delfiini.hahmoPysyyRuudussa(0, -muutos, ikkunanLeveys, ikkunanKorkeus)) {
            delfiini.liikuta(0, -muutos);
        }
        if (nappaimet.contains(KeyEvent.VK_DOWN) && delfiini.hahmoPysyyRuudussa(0, muutos, ikkunanLeveys, ikkunanKorkeus)) {
            delfiini.liikuta(0, muutos);
        }
    }

    public void pallojenLiike() {
        for (Pallo p : pallot) {
            if (p.getX() > 0) {
                p.liikuta(-1, 0);
            } else {
                pallojaOhi++;

                if (pallojaOhi == 20) {
                    nopeusLisa = nopeusLisa + 1.0f;
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

    public void aloita() {
        this.delfiini.setX(1);
        this.delfiini.setY(ikkunanKorkeus / 2);
        this.nappaimet.clear();
        this.nopeusLisa = 2.0f;
        this.osunutVaistettavaan = false;

        for (Pallo p : pallot) {
            nollaaPallo(p);
        }
    }

    public boolean onkoOsunutVaistettavaan() {
        return this.osunutVaistettavaan;
    }

    public void setNappaimet(Set<Integer> nappaimet) {
        this.nappaimet = nappaimet;
    }
}
