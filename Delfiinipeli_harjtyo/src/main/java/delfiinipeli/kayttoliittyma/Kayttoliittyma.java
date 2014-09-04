package delfiinipeli.kayttoliittyma;

import delfiinipeli.logiikka.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Piirtoalusta piirtoalusta;
    private int ikkunanKorkeus;
    private int ikkunanLeveys;
    private Peli peli;
    private Timer ajastin;
    private AjastimenKuuntelija ajastimenKuuntelija;

    public Kayttoliittyma(Peli peli, Piirtoalusta piirtoalusta) {
        this.piirtoalusta = piirtoalusta;
        this.peli = peli;
        this.ajastimenKuuntelija = new AjastimenKuuntelija(peli, piirtoalusta);

        luoAjastin();
    }

    @Override
    public void run() {
        this.ikkunanKorkeus = 650;
        this.ikkunanLeveys = 1050;
        frame = new JFrame("Delfiinipeli");
        frame.setPreferredSize(new Dimension(ikkunanLeveys, ikkunanKorkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

        peli.luoPallot(ikkunanLeveys, ikkunanKorkeus);
        this.ajastin.start();
        
        if (!ajastin.isRunning()) {
            System.out.println("haahaa! peli ohi");
            JOptionPane.showMessageDialog(frame, "plaalaa");
        }

    }

    public void luoAjastin() {
        this.ajastin = new Timer(16, ajastimenKuuntelija /*new AjastimenKuuntelija(peli, piirtoalusta)*/);
        peli.asetaAjastin(ajastin);
    }

    private void luoKomponentit(Container container) {
        container.add(piirtoalusta);
        frame.addKeyListener(new NappaimistonKuuntelija(this.peli, piirtoalusta));
        
//        if (!ajastin.isRunning() /*!ajastimenKuuntelija.getPallotLiikkuu()*/) {
//            System.out.println("haahaa! peli ohi");
//            JOptionPane.showMessageDialog(frame, "plaalaa");
//        }
//        JOptionPane.showMessageDialog(frame, "plaalaa");
//        if (peli.getOnkoPeliKaynnissa()) {
//            Object[] options = {"Käynnistä uusi peli",
//                "Lopeta peli"};
//            int n = JOptionPane.showOptionDialog(frame,
//                    "pisteitä",
//                    "Game Over",
//                    JOptionPane.YES_NO_OPTION,
//                    JOptionPane.PLAIN_MESSAGE,
//                    null,
//                    options,
//                    options[2]);

//        }
    }

    public JFrame getFrame() {
        return frame;
    }

    public int getIkkunanLeveys() {
        return this.ikkunanLeveys;
    }

    public int getIkkunanKorkeus() {
        return this.ikkunanKorkeus;
    }
}
