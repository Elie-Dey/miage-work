package fr.dauphine.javaavance.td5;

public class Bike implements  Vehicule{
    private String brand;
    private  static int BIKE_VALUE = 100;

    public Bike(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public int getValue() {
        return BIKE_VALUE;
    }

}
