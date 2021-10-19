package fr.dauphine.javaavance.td3.view;
import fr.dauphine.javaavance.td3.controller.FormController;
import fr.dauphine.javaavance.td3.model.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elie
 */

public class FormVue extends JFrame {
    /**
     * Notre Model Cercle
     */
    private Circle model;
    /**
     * Notre Panel speciale qui sera incorporer dans la fenetre de Vue
     */
    private  PaintPanel mousePanel;


    /**
     *
     * @param model Modele necessaire pour la Vue
     */
    public FormVue(Circle model){
        super("Java Avancé - Graphic Display");
        this.model = model;
        mousePanel = new PaintPanel(model);
        add(mousePanel, BorderLayout.CENTER);
    }

    /**
     *
     * @param listener Ajoute l'ecouteur de la diffusion des evenements possibles
     */
    public void registerListener(FormController listener){
        mousePanel.addMouseMotionListener(listener);
    }

}
