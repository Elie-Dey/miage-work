package fr.dauphine.javaavance.td3;

import fr.dauphine.javaavance.td3.controller.FormController;
import fr.dauphine.javaavance.td3.model.Circle;
import fr.dauphine.javaavance.td3.view.FormVue;

import javax.swing.*;
import java.awt.*;


/**
 *  Classe de lancement
 * @author Elie
 */
public class App{

    /**
     * Main principal de l'app
     */
    public static void main(String[] args) {
        Circle model = new Circle(new Point(200,100), 0);
        FormVue view = new FormVue(model);
        FormController controller = new FormController(model, view);

        view.registerListener(controller);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(new Dimension(500, 500));
        view.setVisible(true);

    }
}
