package delfiinipeli.kayttoliittyma;

import delfiinipeli.logiikka.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import delfiinipeli.logiikka.*;

public class Piirtoalusta extends JPanel {

//    private ArrayList<Hahmo> pelihahmot;
    private Hahmo delfiini;
    private ArrayList<VaistettavatPallot> vaistettavat;
    private ArrayList<PoimittavatPallot> poimittavat;
    
    
       public Piirtoalusta(Delfiini delfiini, ArrayList<VaistettavatPallot> vaistettavat, 
            ArrayList<PoimittavatPallot> poimittavat) {
           super.setBackground(Color.WHITE);
           this.delfiini = delfiini;
           this.vaistettavat = vaistettavat;
           this.poimittavat = poimittavat;
           
       }
    
//    public Piirtoalusta(ArrayList<Hahmo> pelihahmot) {
//        super.setBackground(Color.WHITE);
//        this.pelihahmot = pelihahmot;
//    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillOval(delfiini.getX(), delfiini.getY(), delfiini.getLeveys(), delfiini.getKorkeus());
        
        for (PoimittavatPallot p : poimittavat) {
        graphics.fillOval(p.getX(), p.getY(), p.getLeveys(), p.getKorkeus());
//        for (Hahmo hahmonen : pelihahmot) {
//            hahmonen.piirra(graphics);
        }
    }
}
