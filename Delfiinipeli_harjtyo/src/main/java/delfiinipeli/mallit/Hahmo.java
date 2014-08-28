package delfiinipeli.mallit;

public class Hahmo {

    private int x;
    private int y;

    public Hahmo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void liikuta(int xmuutos, int ymuutos) {
        this.x += xmuutos;
        this.y += ymuutos;
    }

    public boolean hahmoPysyyRuudussa(int xmuutos, int ymuutos, int leveys, int korkeus) {
        if (x + xmuutos < leveys && x + xmuutos > 0 && y + ymuutos < korkeus && y + ymuutos > 0) {
            return true;
        }
        
        return false;
    }
}
