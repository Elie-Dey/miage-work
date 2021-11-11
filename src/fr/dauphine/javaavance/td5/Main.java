package fr.dauphine.javaavance.td5;

public class Main {

    public static void main(String[] args) {
//        Car c = new Car("Ferra ", 10000L, 2);
//        System.out.println(c);

        Car a = new Car("Audi",10000);
        Car b = new Car("BMW",11000);
        Car f = new Car("ZMW",1000);
        Car h = new Car("TMW",7000);
        Car p = new Car("BMW",9000);
        Car d = a;

        Bike bike = new Bike("Decath");
        Bike bmx = new Bike("Bmx");
        Bike zmx = new Bike("Zmx");


        Garage g = new Garage();
        g.addCar(b);
        g.addCar(zmx);
        g.addCar(bmx);
        g.addCar(bike);
        g.addCar(a);
        g.addCar(h);
        g.addCar(f);
        g.addCar(p);


        g.affichage();
        System.out.println();
        System.out.println("============================ ");
        System.out.println(g.firstCarByBrand("BMW"));
        //g.trie();
        //Echec Test parce que les paramettres sont pas les bons
        //Resultat non statifaisant parce que il ne sont pas ordonnés
    }
}
