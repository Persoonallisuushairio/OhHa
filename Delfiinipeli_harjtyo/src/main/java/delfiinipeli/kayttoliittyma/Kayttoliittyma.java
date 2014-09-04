package delfiinipeli.kayttoliittyma;

import delfiinipeli.logiikka.*;
import java.awt.*;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private final Piirtoalusta piirtoalusta;
    private int ikkunanKorkeus;
    private int ikkunanLeveys;
    private Peli peli;
    private Timer ajastin;

    public Kayttoliittyma(Peli peli, Piirtoalusta piirtoalusta) {
        this.piirtoalusta = piirtoalusta;
        this.peli = peli;
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

        this.ajastin = new Timer(16, new AjastimenKuuntelija(this));

        kaynnista();
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

    public Piirtoalusta getPiirtoalusta() {
        return this.piirtoalusta;
    }

    public int getIkkunanLeveys() {
        return this.ikkunanLeveys;
    }

    public int getIkkunanKorkeus() {
        return this.ikkunanKorkeus;
    }

    public void kaynnista() {
        peli.aloita();
        ajastin.start();
    }

    public void paivita() {
        if (peli.onkoOsunutVaistettavaan()) {
            ajastin.stop();
            luoLopetusruutu();
            return;
        }
        peli.pallojenLiike();
        piirtoalusta.repaint();
    }

    public void luoLopetusruutu() {
        Object[] options = {"Käynnistä uusi peli",
            "Lopeta peli"};
        int n = JOptionPane.showOptionDialog(frame,
                peli.getLaskuri().toString(),
                "Game Over",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        if (n == JOptionPane.YES_OPTION) {
            peli.getLaskuri().nollaaLaskuri();
            kaynnista();
        } else {
            frame.dispose();
        }
    }
}
