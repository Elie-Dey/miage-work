package fr.dauphine.javaavance.td2;

public class Racine extends  Expr{
    public Racine(Expr a){
        super(Math.sqrt(a.eval()));
    }

    @Override
    public String toString() {
        return " \u221a" + 5;
    }
}
