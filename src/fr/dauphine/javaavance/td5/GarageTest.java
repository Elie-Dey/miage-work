package fr.dauphine.javaavance.td5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GarageTest {

    @Test
    void addCar() {

    }


//    @Test
//    void affichage() {
//        Garage g = new Garage();
//        Car c1 = new Car("BMW", 9000);
//        Car car2 = new Car("Merco", 1000);
//        g.addCar(c1);
//        g.addCar(car2);
//        assertEquals("brand= BMW, value=9000", g.affichage());
//    }

    @Test
    void garageValue() {
        Garage g = new Garage();
        Car c1 = new Car("BMW", 9000);
        Car car2 = new Car("Merco", 1000);
        g.addCar(c1);
        g.addCar(car2);
        assertEquals(10000, g.GarageValue());
    }

    @Test
    void firstCarByBrand() {
        Garage g = new Garage();
        Car c1 = new Car("BMW", 9000);
        Car car2 = new Car("Merco", 13000);
        Car car3 = new Car("Merco", 1000);
        g.addCar(c1);
        g.addCar(car2);
        g.addCar(car3);
        assertEquals("Merco,13000", g.firstCarByBrand("Merco").toString());
    }

    @Test
    void remove() {
    }

    @Test
    void protectionism() {
    }

    @Test
    void testEquals() {
    }
}