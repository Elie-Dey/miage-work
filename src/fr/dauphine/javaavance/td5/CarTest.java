package fr.dauphine.javaavance.td5;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @org.junit.jupiter.api.Test
    void getBrand() {
        Car c = new Car("BMW", 1200);
        assertEquals("BMW", c.getBrand());
    }

    @org.junit.jupiter.api.Test
    void getValue() {
        Car c = new Car("BMW", 1200);
        assertEquals(1200, c.getValue());
    }
}