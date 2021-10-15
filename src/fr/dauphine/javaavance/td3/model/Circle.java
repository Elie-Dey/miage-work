
package fr.dauphine.javaavance.td3.model;
import java.awt.*;

/**
 * @author Elie
 */
public class Circle {
    /**
     * Rayon du cercle
     */
    private int radius;
    /**
     * Point representant le centre du cercle
     */
    private Point center;

    public Circle(Point centerOftheCirle, int radiusOfTheCircle){
        this.radius = radiusOfTheCircle;
        this.center = centerOftheCirle;
    }

    /**
     *
     * @return le rayon du cercle courant
     */
    public int getRadius() {
        return radius;
    }

    /**
     *
     * @param radius le nouveau rayon du cercle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     *
     * @return le centre du cercle courant
     */

    public Point getCenter() {
        return center;
    }

    /**
     *
     * @param center change le centre du cercle par un nouveau centre
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    /**
     *
     * @param dx coordonnee ajoutee a x pour la translation
     * @param dy coordonnee ajoutee a y pour la translation
     * @return le nouveau cercle apres translation
     */
    public Circle translate(int dx, int dy){
         center.translate(dx, dy);
         Circle newCercle = new Circle(center, radius);
            return  newCercle;
    }

    /**
     *
     * @return l'air du cercle courant
     */
    public double area(){
        return Math.pow((double) radius, 2) * Math.PI;
    }

    /**
     *
     * @param p
     * @return
     */
    public boolean contains(Point p){
        //Calcul de la distance avec Pythagore
        double distance = Math.sqrt((double) Math.pow(center.getX() - p.getX(),2) + (double) Math.pow(center.getY() - p.getY(),2));
        System.out.println(distance);
        return distance <= radius;
    }

    /**
     *
     * @param p
     * @param circles
     * @return
     */
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
}
