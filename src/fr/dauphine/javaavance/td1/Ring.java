package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class Ring  extends  Circle{

    private Point center;
    private int internRaduis, externRadius;

    Ring(Point pointCenter, int valueInternRaduis, int valueExterneRaduis){
        super(pointCenter, Math.min(valueInternRaduis, valueExterneRaduis));
//        this.center = pointCenter;
           this.internRaduis = Math.min(valueInternRaduis, valueExterneRaduis);
           this.externRadius = Math.max(valueInternRaduis, valueExterneRaduis);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ring)) return false;
        Ring ring = (Ring) o;
        return internRaduis == ring.internRaduis && externRadius == ring.externRadius && Objects.equals(center, ring.center);
    }
    @Override
    public String toString() {
        return "Ring{" + super.toString() +
                ", externRadius=" + externRadius +
                '}';
    }
    public boolean contains(Point p){
        Double distance = Math.sqrt((double) Math.pow(center.getX() - p.getX(),2) + (double) Math.pow(center.getY() - p.getY(),2));
        return distance <= externRadius;
    }
   // public boolean contains(Point p, Ring...rings){

}
