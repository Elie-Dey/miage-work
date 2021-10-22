package fr.dauphine.javaavance.td4;

public class MyList {
    private Cell head = null;

    public void add(String  value){
        //Creation d'une Cell de stockage
        Cell myHead = new Cell(value);
        // Head deviens sa prochaine cell juste pour stocker head et cette Cell devient Head
        //donc la premier Cell de la liste
        myHead.setNextCell(head);
        head = myHead;
    }
    public int size(){
        int numberOfElements = 0;
        Cell currentCell = head;
        //Tant que la Cell courant n'est pas null elle même alors j'ai au moins un element donc
        //je peux incrementer la valeur de numberOfElements
        while (currentCell != null){
            numberOfElements++;
            currentCell = currentCell.getNextCell();
        }
        return numberOfElements;
    }

   public String toString(){
        // Initialiser ma Cell courant par le head
       Cell currentCell = head;

       // String d'initialisation vide a laquelle s'ajoutera la valeur de la lsite
       String str = " ";

       //Tant que la Cell courant n'est pas null elle même alors j'ai au moins un element donc
       //je peux afficher la valeur presente dans cette Cell
       while (currentCell != null){

           str = str + currentCell.getValue() + " -> ";

           //Si la Cell courante n'est pas null et que la Cell vers laquelle elle pointe
           // n'est pas null alors elle devient ma Cell courante
           currentCell = currentCell.getNextCell();
       }

       return  str;
   }
   public void addLast(String value){
        // Creation d'une Cell qui stocke la nouvelle et cette
       //Cell doit ête la derniere de la liste

        Cell myEndCell = new Cell(value);
        myEndCell.setNextCell(null);

        //Verification si la liste n'est pas vide alors on ajoute
        // le valeur dans la premiere Cell donc le Head
       if (head == null) {
           head = new Cell(value);
       }

       // Sinon definition par defaut de head comme la derniere Cell de notre liste

       Cell defaultEndCellOfList  = head;
       while (defaultEndCellOfList.getNextCell() != null){
           defaultEndCellOfList = defaultEndCellOfList.getNextCell();
       }
       //Une fois la derniere Cell atteinte on lui modifie sa prochaine Cellqui est normalement Null
       //Par notre nouvelle Cell qui doit être la derniere
       defaultEndCellOfList.setNextCell(myEndCell);
   }

   public void add(String value, int index){

        if(index>this.size()){
            System.out.println("Index hors de la liste");
            return;
        }
        Cell CellOfSave = new Cell(value);
        Cell currentCell = head;
        int j = 0;
        while (j != index){
                if(currentCell == null){
                    head = CellOfSave;
                    return;
                } else {
                    currentCell = currentCell.getNextCell();
                }
            j++;
        }
        currentCell.setNextCell(CellOfSave);
   }

}
