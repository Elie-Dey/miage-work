package fr.dauphine.javaavance.td5;

import java.util.ArrayList;

public class TdCode {

    public static void main(String[] args) {

        Car a = new Car("Audi",10000);
        Car b = new Car("BMW",9000);
        Car c = new Car("BMW",9000);
        Car d = a;
        ArrayList<Car> list = new ArrayList<>();
        list.add(a);
        list.add(b);

//        System.out.println(a==b);
//        System.out.println(b==c);
//        System.out.println(a==d);
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(c));
//        System.out.println(a.equals(d));

//        System.out.println(c.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(list.indexOf(a));
//        System.out.println(list.lastIndexOf(b));
//        System.out.println(list.indexOf(c));
//        System.out.println(list.contains(c));
//        System.out.println(b.equals(c));
//        HashSet<Car> set = new HashSet<Car>();
//        set.add(b);
//        System.out.println(set.contains(c));
    }

}
