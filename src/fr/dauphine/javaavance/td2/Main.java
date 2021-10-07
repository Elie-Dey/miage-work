package fr.dauphine.javaavance.td2;

public class Main {

    public static void main(String[] args) {
        Expr val = new Value(1337.0);
        System.out.println(val.eval());
        Expr add = new Add(new Value(327.0), val);
        System.out.println(add.eval());
//        Mere mere=new Mere();
//        Mere mereFille=new Fille();
//        Fille fille=new Fille();
//
//        mere.miage();
//        fille.miage();
//        mereFille.miage();
//        ((Fille)mereFille).miage();
//
//         mere.a();
//        mereFille.a();
//        fille.a();
//        ((Mere)mereFille).a();
//        mereFille.b(null);
//
//        mereFille.c();
//        mereFille.c(mere);
//        mereFille.c(mereFille);
//        mereFille.c(fille);
//        fille.c(fille);
//
//        mere.d();
//        mereFille.d();
//        mere.printF();
//        mereFille.printF();
//
//        mereFille.j();
//        mereFille.k();
//        mereFille.l();
//        mereFille.m();
//        Mere mere = new Mere();
//        System.out.println(mere.meth);
//        mere.printMeth();
//
//        Fille fille = new Fille();
//        System.out.println(fille.meth);
//        fille.printMeth();
//
//
//        Mere mereFille = new Fille();
//        System.out.println(mereFille.meth);
//        mereFille.printMeth();

    }
}
