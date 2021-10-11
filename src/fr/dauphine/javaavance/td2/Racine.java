package fr.dauphine.javaavance.td2;

public class Racine extends  Expr {
    private Expr firstExpression;

    Racine(Expr givenExpression){
        super(givenExpression);
        firstExpression = givenExpression;
    }
    public double eval(){
        return Math.sqrt(firstExpression.eval());
    }
}
