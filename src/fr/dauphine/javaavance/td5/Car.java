package fr.dauphine.javaavance.td5;

import java.util.Objects;

/**
 * @author Elie
 */
public class Car  extends Vehicule{
    private int value;
    private  int antiquatedLevel;

    /**
     *
     * @param brand
     * @param value
     */
//    public Car(String brand, Long value) {
//        this.brand = brand;
//        if(value < 0)
//            throw new IllegalArgumentException("Value negative");
//        this.value = value;
//    }

    public Car(String brand, int value) {
        super(brand, value, null);
        if(value < 0)
            throw new IllegalArgumentException("Value negative");
        this.value = value;
    }

    /**
     *  @param brand
     * @param value
     * @param antiquatedLevel
     *
     */
//    public Car(String brand, Long value, int antiquatedLevel) {
//        this.brand = brand;
//        this.value = value - (1000)*antiquatedLevel ;
//        this.antiquatedLevel = antiquatedLevel;
//    }
    public Car(String brand, int value, int antiquatedLevel) {
        super(brand, value, null);
        this.value = value - (1000)*antiquatedLevel ;
        this.antiquatedLevel = antiquatedLevel;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return super.getBrand();
    }

    /**
     *
     * @return
     */
//    public Long getValue() {
//        return value;
//    }
    public int getValue() {
        return value;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.getBrand() + "," + value + "\n";
    }


    public boolean equals(Car c) {
        if (this == c) return true;
        return getValue() == c.getValue() && antiquatedLevel == c.antiquatedLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), antiquatedLevel);
    }
}
