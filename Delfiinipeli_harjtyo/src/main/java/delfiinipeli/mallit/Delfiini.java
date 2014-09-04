package delfiinipeli.mallit;
import delfiinipeli.logiikka.*;

public class Delfiini extends Hahmo{
//    private int ulottuvuusVaistettava;
//    private int ulottuvuusPoimittava;
    
    
    public Delfiini(int x, int y/*, int ulottuvuus*/) {
        super(x, y, 1.0f);
//        this.ulottuvuusVaistettava = 45; 
//        this.ulottuvuusPoimittava = 30;
//        this.ulottuvuus = ulottuvuus;
    }
         
//    public int getUlottuvuus() {
//        return ulottuvuus;
//    }
//
//    public void setUlottuvuus(int ulottuvuus) {
//        this.ulottuvuus = ulottuvuus;
//    }
    public int pallonTyyppi(Pallo pallo) {
        int vaistettava = 30;
        int poimittava = 55;
        if (pallo.onkoVaistettava()) {
            return vaistettava; 
        } 
        return poimittava;   
        }
   
    public boolean osuuko(Pallo pallo) {
        // Yksinkertainen ympyräosumatarkistus        
        int xmuutos = pallo.getX() - getX();
        int ymuutos = pallo.getY() - getY();
        int sademuutos = pallo.getSade() + pallonTyyppi(pallo); /*getUlottuvuus();*/
        
        if((xmuutos * xmuutos) + (ymuutos * ymuutos) <= (sademuutos * sademuutos)) {
            System.out.println("osuu :>");
            return true;
        }    
        
        return false;
    }
}

