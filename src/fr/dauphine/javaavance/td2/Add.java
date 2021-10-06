package fr.dauphine.javaavance.td2;

public class Add extends  Expr{
    public final int addValue;
    public Add(int val, int addValue) {
        super(val);
        this.addValue = addValue;
    }
}
