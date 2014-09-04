package delfiinipeli.logiikka;
import delfiinipeli.kayttoliittyma.Kayttoliittyma;
import java.awt.event.*;

public class AjastimenKuuntelija implements ActionListener {
    private final Kayttoliittyma kayttoliittyma;
    
    
    public AjastimenKuuntelija(Kayttoliittyma kayttoliittyma) {
        this.kayttoliittyma = kayttoliittyma;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kayttoliittyma.paivita();
    }
    
}
