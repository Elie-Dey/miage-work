package fr.dauphine.javaavance.td2;

public class Racine extends  Expr {
    private Expr firstExpression;

    /**
     *
     * @param givenExpression
     */
    Racine(Expr givenExpression){
        super(givenExpression);
        firstExpression = givenExpression;
    }

    /**
     *
     * @return
     */
    public double eval(){
        return Math.sqrt(firstExpression.eval());
    }
}
