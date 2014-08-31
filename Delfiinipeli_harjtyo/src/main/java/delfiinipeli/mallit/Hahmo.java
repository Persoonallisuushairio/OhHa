package delfiinipeli.mallit;

public class Hahmo {

    private float x;
    private float y;
    private final float nopeus;
    
    public Hahmo(int x, int y, float nopeus) {
        this.x = x;
        this.y = y;
        this.nopeus = nopeus;
    }

    public int getX() {
        return (int)x;
    }

    public int getY() {
        return (int)y;
    }

    public void liikuta(int xmuutos, int ymuutos) {
        this.x += xmuutos * nopeus;
        this.y += ymuutos;
    }

    public boolean hahmoPysyyRuudussa(int xmuutos, int ymuutos, int leveys, int korkeus) {
        if (x + xmuutos < leveys && x + xmuutos > 0 && y + ymuutos < korkeus && y + ymuutos > 0) {
            return true;
        }
        
        return false;
    }
}
