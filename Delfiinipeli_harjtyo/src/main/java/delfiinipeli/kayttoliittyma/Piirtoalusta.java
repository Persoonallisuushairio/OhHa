package delfiinipeli.kayttoliittyma;

import delfiinipeli.mallit.Hahmo;
import delfiinipeli.mallit.Pallo;
import delfiinipeli.logiikka.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Piirtoalusta extends JPanel {

//    private ArrayList<Hahmo> pelihahmot;
    private final Hahmo delfiini;
    private BufferedImage delfiiniKuva;
    
    private final ArrayList<Pallo> vaistettavat;
    private final ArrayList<Pallo> poimittavat;
    
    
       public Piirtoalusta(Hahmo delfiini, ArrayList<Pallo> vaistettavat, 
            ArrayList<Pallo> poimittavat) {
           super.setBackground(Color.WHITE);
           this.delfiini = delfiini;
           this.vaistettavat = vaistettavat;
           this.poimittavat = poimittavat;
           
        try {
            this.delfiiniKuva = ImageIO.read(new File("flipper.png"));
        } catch (IOException ex) {
            Logger.getLogger(Piirtoalusta.class.getName()).log(Level.SEVERE, null, ex);
            this.delfiiniKuva = null;
        }
       }

       
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.drawImage(delfiiniKuva, delfiini.getX(), delfiini.getY(), null);
        //graphics.fillOval(delfiini.getX(), delfiini.getY(), delfiini.getLeveys(), delfiini.getKorkeus());
        
        for (Pallo p : poimittavat) {
            graphics.setColor(p.getVari());
            graphics.fillOval(p.getX(), p.getY(), p.getSade() * 2, p.getSade() * 2);
        }
    }
}
