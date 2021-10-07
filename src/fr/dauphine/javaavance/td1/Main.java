package fr.dauphine.javaavance.td1;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1,2), 1);
        Circle c2 = new Circle(new Point(1,3), 2);

        System.out.println(Circle.contains(new Point(1,1), c2));
    }
}
