package fr.dauphine.javaavance.td2;

public class Expr {
    private  final int value;

    public Expr(int value) {
        this.value = value;
    }
    public  int eval(){
        return value;
    }
}
