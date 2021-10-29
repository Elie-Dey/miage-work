package fr.dauphine.javaavance.td5;

import java.util.Objects;

/**
 * @author Elie
 */
public class Car  implements  Vehicule{
    private final String brand;
    //private final Long value;
    private final int value;
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
        this.brand = brand;
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
        this.brand = brand;
        this.value = value - (1000)*antiquatedLevel ;
        this.antiquatedLevel = antiquatedLevel;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
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
        return "Car{" +
                "brand='" + brand + '\'' +
                ", value=" + value +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getValue(), antiquatedLevel);
    }
}
