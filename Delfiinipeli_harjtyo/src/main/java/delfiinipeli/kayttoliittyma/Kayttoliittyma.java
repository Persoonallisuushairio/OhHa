package delfiinipeli.kayttoliittyma;

import delfiinipeli.logiikka.*;
import java.awt.*;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private final Piirtoalusta piirtoalusta;
    private final int ikkunanKorkeus;
    private final int ikkunanLeveys;
    private final Peli peli;
    private Timer ajastin;

    public Kayttoliittyma() {
        this.ikkunanKorkeus = 650;
        this.ikkunanLeveys = 1050;
        
        this.peli = new Peli(ikkunanLeveys, ikkunanKorkeus);
        this.piirtoalusta = new Piirtoalusta(peli);
    }

    @Override
    public void run() {
        frame = new JFrame("Delfiinipeli");
        frame.setPreferredSize(new Dimension(ikkunanLeveys, ikkunanKorkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

        this.ajastin = new Timer(16, new AjastimenKuuntelija(this));
        kaynnista();
    }

    private void luoKomponentit(Container container) {
        container.add(piirtoalusta);
        NappaimistonKuuntelija kuuntelija = new NappaimistonKuuntelija();
        peli.setNappaimet(kuuntelija.getNappaimet());
        
        frame.addKeyListener(kuuntelija);
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
        
        peli.delfiininLiike();
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
