package fr.dauphine.javaavance.td2;

public  class Expr {
    private Expr firstExpression;
    private  Expr secondExpression;
    private double valueOfExpression;

    Expr(double givenValue){
        this.valueOfExpression = givenValue;
    }
    Expr(Expr grivenFirstExpression){
        this.firstExpression = grivenFirstExpression;
    }
    Expr(Expr grivenFirstExpression, Expr givenSecondExpression){
        this.firstExpression = grivenFirstExpression;
        this.secondExpression = givenSecondExpression;
    }
    public double eval(){
        return  valueOfExpression;
    }
}
