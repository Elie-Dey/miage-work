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
        Point newPoint  = new Point(this.x, this.y);
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
        return (this.x == point.x && this.y == point.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getX() == point.getX() && getY() == point.getY();
    }
    public Point translate(int dx, int dy){
        Point newPoint = new Point(x + dx,y + dy);
        return newPoint;
    }
}
