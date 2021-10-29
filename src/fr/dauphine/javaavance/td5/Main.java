package fr.dauphine.javaavance.td5;

public class Main {

    public static void main(String[] args) {
//        Car c = new Car("Ferra ", 10000L, 2);
//        System.out.println(c);

        Car a = new Car("Audi",10000);
        Car b = new Car("BMW",11000);
        Car f = new Car("BMW",1000);
        Car h = new Car("BMW",7000);
        Car c = new Car("BMW",9000);
        Car d = a;

        Bike bike = new Bike("Decath");
        Bike bmx = new Bike("Bmx");



        Garage g = new Garage();
        g.addCar(a);
        g.addCar(b);
        g.addCar(f);
        g.addCar(h);

        g.addCar(bike);
        g.addCar(bmx);

       //g.affichage();
       //g.remove(c);
        System.out.println("========");
        g.affichage();

        System.out.println(g.GarageValue());
//        System.out.println(a==b);
//        System.out.println(b==c);
//        System.out.println(a==d);
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(c));
//        System.out.println(a.equals(d));

//        ArrayList<Car> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//
//        System.out.println(list.indexOf(a));
//        System.out.println(list.indexOf(b));
//        System.out.println(list.indexOf(c));
//        System.out.println(b.equals(c));
    }
}
