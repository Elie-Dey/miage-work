package fr.dauphine.javaavance.td2;

public  class Expr {



    private Expr firstExpression;
    private  Expr secondExpression;
    private double valueOfExpression;

    /**
     *
     * @param givenValue
     */
    Expr(double givenValue){
        this.valueOfExpression = givenValue;
    }

    /**
     *
     * @param grivenFirstExpression
     */
    Expr(Expr grivenFirstExpression){
        this.firstExpression = grivenFirstExpression;
    }

    /**
     *
     * @param grivenFirstExpression
     * @param givenSecondExpression
     */
    Expr(Expr grivenFirstExpression, Expr givenSecondExpression){
        this.firstExpression = grivenFirstExpression;
        this.secondExpression = givenSecondExpression;
    }

    /**
     *
     * @return
     */
    public double eval(){
        return  valueOfExpression;
    }
}
