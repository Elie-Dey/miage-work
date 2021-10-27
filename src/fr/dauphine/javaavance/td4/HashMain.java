package fr.dauphine.javaavance.td4;

import fr.dauphine.javaavance.td1.Circle;
import fr.dauphine.javaavance.td1.Point;

import java.util.HashMap;
import java.util.Map;

public class HashMain {
    public static void main(String[] args) {
        Map<Point, Circle> m = new HashMap<>();

        Point p1 = new Point(100,150);
        Circle c1 = new Circle(p1, 100);
        m.put(p1, c1);
        System.out.println(m.containsKey(p1));
        System.out.println(m.containsKey(new Point(1,2)));

    }

    // Pour fixer ce probleme il faut redefinir les methodes equals et hashcode

}
