package fr.dauphine.javaavance.td1;

public class Circle {
    private int radius;
    private Point center;

    Circle(Point centerOftheCirle, int radiusOfTheCircle){
        this.radius = radiusOfTheCircle;
        this.center = centerOftheCirle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public Circle translate(int dx, int dy){
            Point newCenter = new Point(center.getX() + dx, center.getY()+dy);
            Circle newCercle = new Circle(newCenter, radius);
            return  newCercle;
    }
    public double area(){
        return Math.pow((double) radius, 2) * Math.PI;
    }
    public boolean contains(Point p){
        //Calcul de la distance avec Pythagore
        Double distance = Math.sqrt((double) Math.pow(center.getX() - p.getX(),2) + (double) Math.pow(center.getY() - p.getY(),2));

        return distance <= radius;
    }
//    public boolean contains(Point p, Circle...circles){
//
//    }
}
