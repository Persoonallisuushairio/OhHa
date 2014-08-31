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
    
    public Peli() {    
       delfiini = new Delfiini(50, 50, 30);
       poimittavat = new ArrayList<Pallo>();
       vaistettavat = new ArrayList<Pallo>();
    }
    
    public void luoPallot(int leveys, int korkeus) {
        Random r = new Random();
  
        for(int i = 0; i < 10; ++i) {
            int y = r.nextInt(korkeus);
            float nopeus = r.nextFloat() * 9.0f + 1.0f;
            int sade = 20;
            
            Pallo p = new Pallo(leveys, y, nopeus, sade, Color.RED);
            poimittavat.add(p);
        }
   
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


    public void pallojenLiike() {
        for(Pallo p : poimittavat) {
            //TODO: Arvo y
            p.liikuta(-1, 0);
        }
    }
}
