package fr.dauphine.javaavance.td2;

public class Add extends  Expr{
    public Add(Expr a, Expr b) {
        super(a.eval() + b.eval());
    }
}
