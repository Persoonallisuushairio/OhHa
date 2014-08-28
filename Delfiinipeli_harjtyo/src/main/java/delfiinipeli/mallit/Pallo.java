package delfiinipeli.mallit;

import java.awt.Color;

public class Pallo extends Hahmo {
    private Color vari;
    private int sade;

    public Color getVari() {
        return vari;
    }

    public void setVari(Color vari) {
        this.vari = vari;
    }
    
    public int getSade() {
        return sade;
    }
    
    public Pallo(int x, int y, int sade, Color vari) {
        super(x, y);
        this.sade = sade;
        this.vari = vari;
    }
}
