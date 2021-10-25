package fr.dauphine.javaavance.td5;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Elie
 */
public class Garage {
    private ArrayList<Car> carList;
    private static  int id;

    /**
     *
     * @param carList
     */
    public Garage(ArrayList<Car> carList) {
        this.carList = carList;
    }

    /**
     *
     * @param addedCar
     */
    public void addCar(Car addedCar){
        carList.add(Objects.requireNonNull(addedCar));
    }
    /**
     *
     * @return
     */
    public static int getId() {
        return id;
    }

    // Question 8 Essayer de comprendre StringBuilder

    /**
     *
     * @return
     */
    public long GarageValue(){
        Long garageValue  = 0L;
        for (Car car :carList) {
            garageValue = garageValue + car.getValue();
        }
        return  garageValue;
    }

    /**
     *
     * @param searchBrand
     * @return
     */
    public Car firstCarByBrand(String searchBrand){
        Car fistCar = null;
        for (Car car: carList) {
            if(car.getBrand() == searchBrand)
                fistCar = car;
        }
        return fistCar;
    }

    // Que faire si il y a pas la voiture


}
