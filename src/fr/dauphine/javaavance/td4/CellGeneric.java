package fr.dauphine.javaavance.td4;

public class CellGeneric {
    private Object value;
    private CellGeneric nextCell;

    public CellGeneric(Object value) {
        this.value = value;
        this.nextCell = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public CellGeneric getNextCellGeneric() {
        return nextCell;
    }

    public void setNextCellGeneric(CellGeneric nextCell) {
        this.nextCell = nextCell;
    }
}
