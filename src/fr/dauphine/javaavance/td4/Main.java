package fr.dauphine.javaavance.td4;

public class Main {

    public static void main(String[] args) {
        MyList ml = new MyList();
        MyList l = new MyList();
        l.add("Mimi", 0);
        ml.add("Tata");
        ml.add("Toto");
        ml.add("Titi");
        ml.addLast("tatu");
        ml.add("Roro");
        ml.add("Momo", 3);
//        ml.addLast("tutu");

        System.out.println(ml.toString());
        System.out.println(ml.size());
        System.out.println(l.toString());
    }

}
