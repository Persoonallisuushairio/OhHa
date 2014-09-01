package delfiinipeli.mallit;
import delfiinipeli.logiikka.*;

public class Delfiini extends Hahmo{
    private int ulottuvuus;
//    private Pistelaskuri pisteet;
    
    public Delfiini(int x, int y, int ulottuvuus) {
        super(x, y, 1.0f);
        this.ulottuvuus = ulottuvuus;
//      this.pisteet = new Pistelaskuri();  
    }
         
    public int getUlottuvuus() {
        return ulottuvuus;
    }

    public void setUlottuvuus(int ulottuvuus) {
        this.ulottuvuus = ulottuvuus;
    }
    
   
    public boolean osuuko(Pallo pallo) {
        // Yksinkertainen ympyräosumatarkistus
        int xmuutos = pallo.getX() - getX();
        int ymuutos = pallo.getY() - getY();
        int sademuutos = pallo.getSade() + getUlottuvuus();
        
        if((xmuutos * xmuutos) + (ymuutos * ymuutos) <= (sademuutos * sademuutos)) {
            System.out.println("osuu :>");
//            this.pisteet.kasvataArvoa();
//            System.out.println(pisteet.getArvo());
            return true;
        }
        
        return false;
    }
}

