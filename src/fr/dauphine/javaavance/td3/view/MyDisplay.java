package fr.dauphine.javaavance.td3.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elie
 */
public class MyDisplay extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        g.drawLine(50,100,20,20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Avanc´e - Graphic Display");
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDisplay d = new MyDisplay();
        frame.add(d);
    }
}
