package fr.dauphine.javaavance.td5;

import java.util.Objects;

/**
 * @author Elie
 */
public class Car {
    private final String brand;
    private final Long value;
    private  int antiquatedLevel;

    /**
     *
     * @param brand
     * @param value
     */
    public Car(String brand, Long value) {
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
    public Car(String brand, Long value, int antiquatedLevel) {
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
    public Long getValue() {
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

    public boolean equals(Car c) {
        if (this == c) return true;
        if (!(c instanceof Car)) return false;
        Car car = (Car) c;
        return this.antiquatedLevel == car.antiquatedLevel && (this.getBrand() == car.getBrand()) &&  (this.getValue() == car.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getValue(), antiquatedLevel);
    }
}
