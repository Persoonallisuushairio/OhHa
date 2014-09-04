package delfiinipeli.logiikka;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

public class NappaimistonKuuntelija implements KeyListener {
    private final Set<Integer> nappaimet;

    public NappaimistonKuuntelija() {
        this.nappaimet = new HashSet<>();
    }
    
    public Set<Integer> getNappaimet() {
        return nappaimet;
    }

    private boolean onkoHaluttu(int nappain) {
        switch (nappain) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_UP:
                return true;
        }
        
        return false;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(onkoHaluttu(e.getKeyCode())) {
            nappaimet.add(e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(onkoHaluttu(e.getKeyCode())) {
            nappaimet.remove(e.getKeyCode());
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
