package fr.dauphine.javaavance.td2;

public class Multi extends  Expr{
    private Expr firstExpression;
    private Expr secondExpression;

    /**
     *
     * @param myFirstExpressionToAdd
     * @param mySecondExpressionToAdd
     */
    Multi(Expr myFirstExpressionToAdd, Expr mySecondExpressionToAdd) {
        super(myFirstExpressionToAdd, mySecondExpressionToAdd);
    }

    /**
     *
     * @return
     */
    public double eval(){
        return firstExpression.eval() * secondExpression.eval();
    }
}
