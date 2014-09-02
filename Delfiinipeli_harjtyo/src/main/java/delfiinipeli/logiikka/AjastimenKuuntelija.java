package delfiinipeli.logiikka;
import delfiinipeli.kayttoliittyma.Piirtoalusta;
import delfiinipeli.mallit.Pallo;
import javax.swing.*;
import java.awt.event.*;

public class AjastimenKuuntelija implements ActionListener {
    private final Peli peli;
    private final Piirtoalusta piirtoalusta;
    
  
    public AjastimenKuuntelija(Peli peli, Piirtoalusta piirtoalusta) {
        this.peli = peli; 
        this.piirtoalusta = piirtoalusta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {        
        peli.pallojenLiike();
        piirtoalusta.repaint();
    }
    
    
//    for(Pallo p : peli.getPoimittavat()) {
//            this.delfiini.osuuko(p);
    
    
}