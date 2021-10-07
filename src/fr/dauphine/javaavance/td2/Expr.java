package fr.dauphine.javaavance.td2;

public class Expr {
    private double interValue;

    /**
     *
     * @param interValue
     */
    public Expr(double interValue) {
        this.interValue = interValue;
    }

    /**
     *
     * @return internValue
     */
    public double eval(){
        return interValue;
    }

    @Override
    public String toString() {
        return "Expr{" +
                "interValue=" + interValue +
                '}';
    }
}
