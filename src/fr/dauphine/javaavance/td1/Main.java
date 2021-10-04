package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Main {

    public static boolean contains(Point p, Circle...circles){
        boolean isPresent = false;
        if(circles == null)
            return isPresent;
        else {
            for (Circle circle : circles) {
                if(circle.contains(p))
                    isPresent = true;
            }
        }
        return  isPresent;
    }
    public static boolean contains(Point p, Ring...rings){
        boolean isPresent = false;
        if(rings == null)
            return isPresent;
        else {
            for (Ring ring : rings) {
                if(ring.contains(p))
                    isPresent = true;
            }
        }
        return  isPresent;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1,2), 1);
        Circle c2 = new Circle(new Point(1,3), 2);

        System.out.println(contains(new Point(1,1), c1, c2));
    }
}


