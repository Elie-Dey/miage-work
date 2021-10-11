package fr.dauphine.javaavance.td2;

public class Add extends Expr {
  private Expr firstExpression;
  private Expr secondExpression;

  Add(Expr myFirstExpressionToAdd, Expr mySecondExpressionToAdd) {
        super(myFirstExpressionToAdd, mySecondExpressionToAdd);
        firstExpression = myFirstExpressionToAdd;
        secondExpression = mySecondExpressionToAdd;
  }

  public double eval(){
    return firstExpression.eval() + secondExpression.eval();
  }

  @Override
  public String toString() {
    return "Add{ " +
            "firstExpression=" + firstExpression +
            ", secondExpression=" + secondExpression +
            '}';
  }
}
