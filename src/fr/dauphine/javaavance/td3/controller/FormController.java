package fr.dauphine.javaavance.td3.controller;

import fr.dauphine.javaavance.td3.model.Circle;
import fr.dauphine.javaavance.td3.view.FormVue;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * @author Elie
 */

public class FormController implements MouseMotionListener {
    /**
     * Notre Circle comme model dans le controller
     */
     private Circle model;
    /**
     * Un objet de vue dans le controller pour la communication
     */
    private FormVue view;

    /**
     * Constructeur
     *
     */
    public FormController(Circle model, FormVue view){
        this.view = view;
        this.model = model;
    }

    @Override
    public void mouseDragged(MouseEvent event) {
        // Methode pas implementée
    }

    /**
     *
     * @param event Evenemet qui signifie le mouvement de la souris
     */
    @Override
    public void mouseMoved(MouseEvent event) {
       // Point center  = new Point(event.getX(), event.getY());
        Point center = event.getPoint();
        model.setCenter(center);
        view.repaint();
    }
}
