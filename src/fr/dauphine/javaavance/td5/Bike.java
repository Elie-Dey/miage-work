package fr.dauphine.javaavance.td5;

public class Bike extends Vehicule{
    private  static final int value = 100;

    public Bike(String brand) {
        super(brand);
    }
    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + super.getBrand() + '\'' +
                '}';
    }
    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getValue() {
        return value;
    }

}
