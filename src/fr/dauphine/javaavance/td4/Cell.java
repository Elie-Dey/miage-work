package fr.dauphine.javaavance.td4;

public class Cell {
    private String value;
    private Cell nextCell;

    public Cell(String value) {
        this.value = value;
        this.nextCell = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Cell getNextCell() {
        return nextCell;
    }

    public void setNextCell(Cell nextCell) {
        this.nextCell = nextCell;
    }
}
