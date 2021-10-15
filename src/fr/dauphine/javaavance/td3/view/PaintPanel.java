package fr.dauphine.javaavance.td3.view;

import fr.dauphine.javaavance.td3.model.Circle;

import javax.swing.*;
import java.awt.*;


/**
 * @author Elie
 */
public class PaintPanel extends JPanel {
    /**
     * On considere que notre model et que un cercle
     */
    private Circle model;

    /**
     * Constructeur
     * @param model
     */
    public PaintPanel(Circle model){
        this.model = model;
    }

    /**
     * paintComponent dessine le cercle (le Model) avec un rayon fixe
     *
     * @param g Graphics pour pouvoir faire appel aux fonctions de la classe Graphics2D
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Point center = model.getCenter();
        g2.fillOval(center.x, center.y, 80,50);
    }

}

