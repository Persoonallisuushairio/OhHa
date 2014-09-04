package delfiinipeli.mallit;

import java.awt.Color;

public class Pallo extends Hahmo {
    private Color vari;
    private final int sade;
    private boolean vaistettava;
    
     public Pallo(int x, int y, float nopeus, int sade, boolean vaistettava) {
        super(x, y, nopeus);
        this.sade = sade;

         setVaistettava(vaistettava);
    }

    public Color getVari() {
        return vari;
    }

    public final void setVaistettava(boolean vaistettava) {
        if(vaistettava) {
            this.vari = Color.RED;
        } else {
            this.vari = Color.BLUE;
        }
        
        this.vaistettava = vaistettava;
    }
    
    public int getSade() {
        return sade;
    }
    
    public boolean onkoVaistettava() {
        return vaistettava;
    }
    
}
