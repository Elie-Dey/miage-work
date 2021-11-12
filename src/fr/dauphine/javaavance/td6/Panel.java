package fr.dauphine.javaavance.td6;

import java.util.Iterator;

public class Panel {
    public static Iterator<Integer> panel1(int firstBorn, int lastBorn) {
        if(firstBorn > lastBorn)
            throw  new IllegalArgumentException();

        Iterator<Integer> it = new Iterator<Integer>() {

            private int current = firstBorn;

            @Override
            public boolean hasNext() {
                return current >= firstBorn && current <= lastBorn;
            }

            @Override
            public Integer next() {
                return current++;
            }
        };
        return it;
    }

    public static PanelInt panel2(int firstBorn, int lastBorn) {
        PanelInt it = new PanelInt() {
            @Override
            public Iterator<Integer> iterator() {
                Iterator<Integer> it = new Iterator<Integer>() {
                    private int current = firstBorn;
                    @Override
                    public boolean hasNext() {
                        return current >= firstBorn && current <= lastBorn;
                    }

                    @Override
                    public Integer next() {
                        return current++;
                    }
                };
                return it;
            }
        };
        return it;
    }

    public static MyList panel(int first, int last) {
        MyList list = new MyList(first, last);
        return list;
    }
}

