package delfiinipeli.logiikka;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Component;
import java.util.*;

public class NappaimistonKuuntelija implements KeyListener {

    private Component component;
//    private ArrayList<Hahmo> pelihahmot;
    private Hahmo delfiini;
    private Peli peli;

    public NappaimistonKuuntelija(Peli peli, Component component) {
        this.peli = peli;
//        this.pelihahmot = peli.getKaikkiHahmot();
        this.delfiini = peli.getDelfiini();
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && delfiini.hahmoPysyyRuudussa(-30, 0)) {
            this.delfiini.liikuta(-30, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && delfiini.hahmoPysyyRuudussa(30, 0)) {
            this.delfiini.liikuta(30, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && delfiini.hahmoPysyyRuudussa(0, 30)) {
            this.delfiini.liikuta(0, 30);
        } else if (e.getKeyCode() == KeyEvent.VK_UP && delfiini.hahmoPysyyRuudussa(0, -30)) {
            this.delfiini.liikuta(0, -30);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
