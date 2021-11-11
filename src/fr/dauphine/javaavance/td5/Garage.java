package fr.dauphine.javaavance.td5;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(carList, Vehicule.vehiculeComparator);
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
            System.out.print(car);
        }
    }

    /**
     *
     * @return
     */
    public int GarageValue(){
        int garageValue  = 0;
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
       ArrayList<Vehicule> internList = new ArrayList<>();
        for (int i = 0; i < carList.size() ; i++) {
            if(carList.get(i).getBrand() == searchBrand)
                internList.add(carList.get(i));
        }

        return internList.get(0);
    }

    // Que faire si il y a pas la voiture

    /**
     *
     * @param removeCar
     */
    public void remove(Vehicule removeCar){
        int indexOfRemoveCar = 0;
        if(carList.contains(removeCar)){
            indexOfRemoveCar = carList.indexOf(removeCar);
            carList.remove(indexOfRemoveCar);
        } else {
            throw new IllegalArgumentException("Car absente dans le garage");
        }

    }

    /**
     *
     * @param brand
     */
    public void protectionism(String brand){
        int som = 0;
        for (int i = 0; i < carList.size() ; i++) {
            if(carList.get(i).getBrand() == brand)
                carList.remove(i);
                //i--;
        }
    }

    public boolean equals(Garage garage) {
        return  carList.equals(garage.carList);
    }


}
