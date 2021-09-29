package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class Point {
    private int x;
    private int y;
    private static int numberOfPoint; // Variable interne qui nous permet d'avoir le nombre de point creer
    Point(int x, int y ){
        this.x = x;
        this.y = y;
        numberOfPoint++; // Incrementation de numberOfPoint
    }
    Point(Point p2) {
        this.x = p2.x;
        this.y = p2.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public static int getNumberOfPoint() {
        return numberOfPoint;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public Boolean isSameAs(Point point){
        if(this.x == point.x && this.y == point.y)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        Point p = (Point) o;
        return this.isSameAs(p);

//        if (this == o) return true;
//        if (!(o instanceof Point)) return false;
//        Point point = (Point) o;
//        return x == point.x && y == point.y;
    }

}
