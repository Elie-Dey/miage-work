package fr.dauphine.javaavance.td6;

import java.util.AbstractList;

public class MyList extends AbstractList<Integer> {
    private int firstBorn, lastBorn;

    public MyList(int firstBorn, int lastBorn){
        if(firstBorn > lastBorn)
            throw  new IllegalArgumentException();
        this.firstBorn = firstBorn;
        this.lastBorn = lastBorn;
    }

    @Override
    public Integer get(int index) {
        int current;
        current = index + firstBorn;
        if (current > lastBorn || index < 0) {
            throw new IndexOutOfBoundsException("");
        }
        return current;
    }

    @Override
    public int size() {
        return lastBorn - firstBorn +1;
    }
}
