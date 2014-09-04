package delfiinipeli.logiikka;

import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Pallo;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
        
public class NappaimistonKuuntelija implements KeyListener {

    private final Component component;
    private final Delfiini delfiini;
    private final Peli peli;

    public NappaimistonKuuntelija(Peli peli, Component component) {
        this.peli = peli;
        this.delfiini = peli.getDelfiini();
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int muutos = 30;
        int leveys = component.getWidth();
        int korkeus = component.getHeight();
        
        if (e.getKeyCode() == KeyEvent.VK_LEFT && delfiini.hahmoPysyyRuudussa(-muutos, 0, leveys, korkeus)) {
            this.delfiini.liikuta(-muutos, 0);
        }  if (e.getKeyCode() == KeyEvent.VK_RIGHT && delfiini.hahmoPysyyRuudussa(muutos, 0, leveys, korkeus)) {
            this.delfiini.liikuta(muutos, 0);
        }  if (e.getKeyCode() == KeyEvent.VK_DOWN && delfiini.hahmoPysyyRuudussa(0, muutos, leveys, korkeus)) {
            this.delfiini.liikuta(0, muutos);
        }  if (e.getKeyCode() == KeyEvent.VK_UP && delfiini.hahmoPysyyRuudussa(0, -muutos, leveys, korkeus)) {
            this.delfiini.liikuta(0, -muutos);
        }
        
        //component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
