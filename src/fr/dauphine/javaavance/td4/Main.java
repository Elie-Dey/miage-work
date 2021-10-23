package fr.dauphine.javaavance.td4;

public class Main {

    public static void main(String[] args) {
        MyList ml = new MyList();
        MyList l = new MyList();
        MyListGeneric  s =  new MyListGeneric();
        Object b = 10;
        s.add(b);

        System.out.println(s.contains(b));




        l.addLast("z");
        l.add("toto");
        l.add("toto");
        l.addLast("ez");
        System.out.println(l);
        System.out.println(l.sumLetter());

//        ml.add("Tata");
//        ml.add("Toto");
//        ml.add("Titi");
//        ml.addLast("tatu");
//        ml.add("Roro");
       // ml.add("Momo", 3);
//      ml.addLast("tutu");

    //   System.out.println(l.toString());
//
//        System.out.println(ml.size());

    //    System.out.println(l.size());
    }

}
