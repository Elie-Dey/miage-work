package fr.dauphine.javaavance.td5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Car c = new Car("Ferra ", 10000L, 2);
//        System.out.println(c);

        Car a = new Car("Audi",10000l);
        Car b = new Car("BMW",9000l);
        Car c = new Car("BMW",9000l);
        Car d = a;
//        System.out.println(a==b);
//        System.out.println(b==c);
//        System.out.println(a==d);
//        System.out.println(a.equals(b));
     //   System.out.println(b.equals(c));
//        System.out.println(a.equals(d));

        ArrayList<Car> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        System.out.println(list.indexOf(a));
        System.out.println(list.indexOf(b));
        System.out.println(list.indexOf(c));
        System.out.println(b.equals(c));
    }
}
