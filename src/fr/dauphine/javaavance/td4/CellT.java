package fr.dauphine.javaavance.td4;

public class CellT <T>{

    private T value;
    private CellT nextCell;

    public CellT(T value) {
        this.value =  value;
        this.nextCell = null;
    }

    public T getValueT() {
        return value;
    }

    public void setValueT(T value) {
        this.value = value;
    }

    public CellT getNextCellT() {
        return nextCell;
    }

    public void setNextCellT(CellT nextCell) {
        this.nextCell = nextCell;
    }

}

