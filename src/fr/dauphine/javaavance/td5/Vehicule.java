package fr.dauphine.javaavance.td5;

import java.util.Comparator;

public class Vehicule{
    private String brand;
    private int value;
    protected Discount discount = null;

    public Vehicule(String brand, int value, Discount discount) {
        this.brand = brand;
        this.value = value;
        this.discount = discount;
    }

    public Vehicule(String brand){
        this.brand = brand;
    }
    /**
     * @return
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @param discountValue
     */
    public void setDiscount(int discountValue) {
        discount.setValue(discountValue);
        isDiscount();
    }

    /**
     *
     */
    public void isDiscount() {
        if (!(discount == null))
            this.value = discount.getValue();

    }
    public static Comparator<Vehicule> vehiculeComparator = new Comparator<>() {
        @Override
        public int compare(Vehicule o1, Vehicule o2) {
            String firstVehiculeBrand = o1.getBrand().toUpperCase();
            String secondeVehiculeBrand = o2.getBrand().toUpperCase();

            return firstVehiculeBrand.compareTo(secondeVehiculeBrand);
        }
    };
}
