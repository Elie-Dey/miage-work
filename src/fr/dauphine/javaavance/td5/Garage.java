package fr.dauphine.javaavance.td5;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Elie
 */
public class Garage {
    private ArrayList<Vehicule> carList;
    private static  int idGarage;

    /**
     *
     */
    public Garage() {
        carList = new ArrayList<>();
    }
    /**
     *
     * @param addedCar
     */
    public void addCar(Vehicule addedCar){
        carList.add(Objects.requireNonNull(addedCar));
    }
    /**
     *
     * @return
     */
    public static int getId() {
        return idGarage;
    }



    // Question 8 Essayer de comprendre StringBuilder

    public void affichage(){
        for (Vehicule car:
             carList) {
            System.out.println(car);
        }
    }

    /**
     *
     * @return
     */
    public long GarageValue(){
        Long garageValue  = 0L;
        for (Vehicule car :carList) {
            garageValue = garageValue + car.getValue();
        }
        return  garageValue;
    }

    /**
     *
     * @param searchBrand
     * @return
     */
    public Vehicule firstCarByBrand(String searchBrand){
        Vehicule firstCar = null;
        for (Vehicule car: carList) {
            if(car.getBrand() == searchBrand)
                firstCar = car;
        }
        return firstCar;
    }

    // Que faire si il y a pas la voiture

    public void remove(Car removeCar){
        int indexOfRemoveCar = 0;
        if(carList.contains(removeCar)){
            indexOfRemoveCar = carList.indexOf(removeCar);
            carList.remove(indexOfRemoveCar);
        } else {
            throw new IllegalArgumentException("Car absente dans le garage");
        }

    }

}
