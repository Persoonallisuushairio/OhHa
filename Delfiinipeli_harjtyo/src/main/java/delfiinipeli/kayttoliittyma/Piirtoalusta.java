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

    private Peli peli;
    private BufferedImage delfiiniKuva;
    private BufferedImage tausta;

    public Piirtoalusta(Peli peli) {
        this.peli = peli;
        super.setBackground(Color.WHITE);

        try {
            this.delfiiniKuva = ImageIO.read(new File("delfiini70.png"));
        } catch (IOException ex) {
            Logger.getLogger(Piirtoalusta.class.getName()).log(Level.SEVERE, null, ex);
            this.delfiiniKuva = null;
        }
        try {
            this.tausta = ImageIO.read(new File("pelitaustaa.jpg"));
        } catch (IOException e) {
            Logger.getLogger(Piirtoalusta.class.getName()).log(Level.SEVERE, null, e);
            this.tausta = null;
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.drawImage(tausta, 0, 0, null);
        graphics.drawImage(delfiiniKuva, peli.getDelfiini().getX(), peli.getDelfiini().getY(), null);
        graphics.drawString(peli.getLaskuri().toString(), 900, 20);

        for (Pallo p : peli.getPallot()) {
            graphics.setColor(p.getVari());
            graphics.fillOval(p.getX(), p.getY(), p.getSade() * 2, p.getSade() * 2);
        }
    }
}