package fr.dauphine.javaavance.td1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Polyline {

    private LinkedList<Point> listOfPoints;
    public Polyline(){
        listOfPoints = new LinkedList<>();
    }
    //      ANCIEN CODE
    //private Point[] tableOfPoints;
    //private int numberOfElementInTable = 0;

//    Polyline(int numberOfPoints) {
//        tableOfPoints = new Point[numberOfPoints];
//    }

//    public void add(Point pointAjoute) {
//        tableOfPoints[numberOfElementInTable] = Objects.requireNonNull(pointAjoute);
//        numberOfElementInTable++;
//    }

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
//    @Override
//    public String toString() {
//        return "Polyline{" +
//                "tableOfPoints=" + Arrays.toString(tableOfPoints) +
//                ", numberOfElementInTable=" + numberOfElementInTable +
//                '}';
//    }
    //ANCIEN  CODE
//    public int pointCapaity() {
//        return tableOfPoints.length;
//    }
    public int pointCapaity() {
           return listOfPoints.size();
   }
//
//    public int nbPoint() {
//        return numberOfElementInTable;
//    }
//ANCIEN CODE
//    public boolean contains(Point pointVerifiable) {
//        boolean isPresent = false;
//        for (Point point : tableOfPoints) {
//            System.out.println(point);
//            if (point.isSameAs(pointVerifiable))
//                isPresent = true;
//        }
//        return isPresent;
//    }
    public boolean contains(Point pointVerifiable){
        return  listOfPoints.contains(pointVerifiable);
    }


}
