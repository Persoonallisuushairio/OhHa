package delfiinipeli.logiikka;

import java.awt.*;

public abstract class Hahmo {

    private int x;
    private int y;
    private int korkeus;
    private int leveys;

    public Hahmo(int x, int y, int leveys, int korkeus) {
        this.x = x;
        this.y = y;
        this.korkeus = korkeus;
        this.leveys = leveys;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLeveys() {
        return leveys;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public void liikuta(int xmuutos, int ymuutos) {
        this.x += xmuutos;
        this.y += ymuutos;
    }

//    public void piirra(Graphics graphics) {
//        graphics.fillOval(x, y, leveys, korkeus);
//    }

    public boolean hahmoPysyyRuudussa(int xmuutos, int ymuutos) {
        if (x + leveys + xmuutos < 1050 && x + xmuutos > 0 && y + korkeus + ymuutos < 630 && y + ymuutos > 0) {
            return true;
        }
        return false;
    }
}
