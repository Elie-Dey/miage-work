package fr.dauphine.javaavance.td2;

public class Main {

    public static void main(String[] args) {
//        Expr val = new Value(1337.0);
//        System.out.println(val.eval());
//        Expr add = new Add(new Value(327.0), val);
//        System.out.println(add.eval());
//        Expr r = new Racine(new Value(4));
//        System.out.println(r);
//        System.out.println(r.eval());
//
//        Expr e = new Add(new Value(350), add);
//        System.out.println(e.eval());
        Mere mere=new Mere();
        Mere mereFille=new Fille();
        Fille fille=new Fille();

//
        //mere.miage();
       //fait  fille.miage();
        //mereFille.miage();
        //fait((Fille)mereFille).miage();

        //fait  mere.a();
        //fait mereFille.a();
        //fait fille.a();
        //fait((Mere)mereFille).a();
        //System.out.println(mereFille.getClass());
       //fait mereFille.b(null);

       //fait revoir mereFille.c();
        mereFille.c(mere);
        mereFille.c(mereFille);
        mereFille.c(fille);
        fille.c(fille);

        mere.d();
        mereFille.d();
        mere.printF();
        mereFille.printF();

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
