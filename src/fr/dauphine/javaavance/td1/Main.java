package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
   //    Point p = new Point(2,8);
//        Point p1 = p;
//       Point p3 = new Point(1,8);
//        Point p4 = new Point(9,8);
//        System.out.println(p1 == p);
//        System.out.println(p1 == p3);
//
//        ArrayList<Point> list = new ArrayList<>();
//        list.add(p);
//        System.out.println(list.indexOf(p1));
//        System.out.println(list.indexOf(p3));

        //System.out.println(p.isSameAs(p3));

       // System.out.println(p.equals(p3));

//        Point p2 = new Point(5,8);
//        System.out.println(p.getNumberOfPoint());
//        System.out.println(p2);
   //     ====================================================

//        Polyline polyline = new Polyline(3);
//        polyline.add(p);
//        polyline.add(p3);
//        polyline.add(null);
////        polyline.ajoute(p4);
//        System.out.println(polyline.contains(p));
//        System.out.println(polyline.contains(null));

Point p = new Point(100,100);
        Point p2 = new Point(10,6);
Circle c = new Circle(p,5);
Circle c2 = new Circle(p, 6);

        System.out.println(c.contains(p2));
//c2.translate(1,1);
//
//        System.out.println(p);
//
//        System.out.println(c + " " + c2);

//        Ring r = new Ring(p, 5, 2);
//        System.out.println(r);
    }
}


