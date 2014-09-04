package delfiinipeli.mallit;

public class Delfiini extends Hahmo {

    
    public Delfiini(int x, int y) {
        super(x, y, 1.0f);
    }
 
    public int pallonTyyppi(Pallo pallo) {
        int vaistettava = 25;
        int poimittava = 35;
        if (pallo.onkoVaistettava()) {
            return vaistettava; 
        } 
        return poimittava;   
        }
   
    public boolean osuuko(Pallo pallo) {
        // Yksinkertainen ympyräosumatarkistus        
        int xmuutos = pallo.getX() - getX();
        int ymuutos = pallo.getY() - getY();
        int sademuutos = pallo.getSade() + pallonTyyppi(pallo);
        
        if((xmuutos * xmuutos) + (ymuutos * ymuutos) <= (sademuutos * sademuutos)) {
            return true;
        }    
        
        return false;
    }
}

