package fr.dauphine.javaavance.td4;

public class CellGeneric {
    private Object value;
    private CellGeneric nextCell;

    /**
     *
     * @param value
     */
    public CellGeneric(Object value) {
        this.value = value;
        this.nextCell = null;
    }

    /**
     *
     * @return
     */
    public Object getValue() {
        return value;
    }

    /**
     *
     * @param value
     */

    public void setValue(Object value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public CellGeneric getNextCellGeneric() {
        return nextCell;
    }

    /**
     *
     * @param nextCell
     */
    public void setNextCellGeneric(CellGeneric nextCell) {
        this.nextCell = nextCell;
    }
}
