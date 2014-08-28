package delfiinipeli.logiikka;

public class Pistelaskuri {

    private int arvo;

    public Pistelaskuri() {
        this.arvo = 0;
    }

    public int getArvo() {
        return this.arvo;
    }

    public void kasvataArvoa() {
        this.arvo++;
    }
}
