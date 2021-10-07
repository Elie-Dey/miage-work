package fr.dauphine.javaavance.td2;

public class Multi extends  Expr{
    public Multi(Expr a, Expr b){
        super(a.eval()*b.eval());
    }
}
