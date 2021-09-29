package fr.dauphine.javaavance.td1;

import java.util.Arrays;

public class Polyline {
    private Point []tableOfPoints;
    private int numberOfElementInTable = 0;

    Polyline(int numberOfPoints){
        tableOfPoints = new Point[numberOfPoints];
    }
    public void add(Point pointAjoute){
        tableOfPoints[numberOfElementInTable] = pointAjoute;
        numberOfElementInTable++;
    }

//    public void ajoute(Point p){
//        tableOfPoints[numberOfElementInTable] = p;
//        numberOfElementInTable++;
//
//        if(numberOfElementInTable >= tableOfPoints.length){
//            int n = tableOfPoints.length;
//            Point[] newTable  = new Point[n+1];
//            for (int i = 0; i < n; i++) {
//                newTable[i] = tableOfPoints[i];
//            }
//            newTable[n] = p;
//            System.out.println(Arrays.toString(newTable));
//        }
//
////        tableOfPoints[numberOfElementInTable] = p;
////        numberOfElementInTable++;
//    }
    @Override
    public String toString() {
        return "Polyline{" +
                "tableOfPoints=" + Arrays.toString(tableOfPoints) +
                ", numberOfElementInTable=" + numberOfElementInTable +
                '}';
    }
}
