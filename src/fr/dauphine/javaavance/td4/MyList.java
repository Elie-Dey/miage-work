package fr.dauphine.javaavance.td4;

public class MyList {
    private Cell head = null;

    /**
     *
     * @param value
     */
    public void add(String  value) throws  NullPointerException{

        if(value == null)
            throw new NullPointerException();
        //Creation d'une Cell de stockage
        Cell myHead = new Cell(value);
        // Head deviens sa prochaine cell juste pour stocker head et cette Cell devient Head
        //donc la premier Cell de la liste
        myHead.setNextCell(head);
        head = myHead;
    }

    /**
     *
     * @return
     */

    //Modification de Size pas compris encore
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

    /**
     *
     * @return
     */
   public String toString(){
        // Initialiser ma Cell courant par le head
       Cell currentCell = head;

       // String d'initialisation vide a laquelle s'ajoutera la valeur de la lsite
       String str = "";

       //Tant que la Cell courant n'est pas null elle même alors j'ai au moins un element donc
       //je peux afficher la valeur presente dans cette Cell
       while (currentCell != null){


           if (currentCell.getNextCell() == null) {
               str = str + currentCell.getValue();
           } else {
               str = str + currentCell.getValue() + ", ";
           }

           //Si la Cell courante n'est pas null et que la Cell vers laquelle elle pointe
           // n'est pas null alors elle devient ma Cell courante
           currentCell = currentCell.getNextCell();
       }

       return  str;
   }

    /**
     *
     * @param value
     */
   public void addLast(String value)throws  NullPointerException{

       if(value == null)
           throw new NullPointerException();
        // Creation d'une Cell qui stocke la nouvelle et cette
       //Cell doit ête la derniere de la liste

        Cell myEndCell = new Cell(value);
        myEndCell.setNextCell(null);

        //Verification si la liste n'est pas vide alors on ajoute
        // le valeur dans la premiere Cell donc le Head
       if (head == null) {
           head = new Cell(value);
           return;
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

    /**
     *
     * @param value valeur que l'on veut ajoutée dans la liste
     * @param index position de la cellule où ajouter value
     */

   public void add(String value, int index){
       Cell currentCell = head;
       int j = 0;
       //Verfication de l'index entré par le user
        if(index>this.size()){
            addLast(value);
            return;
        }
        if(currentCell == null){
            add(value);
            return;
        }
        while (j != index){
                if(currentCell != null)
                    currentCell = currentCell.getNextCell();
                j++;
        }
        currentCell.getNextCell().setValue(value);
  }

    /**
     *
     * @param index
     * @return la valeur contenue dans la cellule à la position index dans la liste
     */
  public String get(int index) throws IndexOutOfBoundsException{

        Cell currentCell = head;
        String str = "";
        String  CellContent = "";
        int i = 0;
        if(index > this.size() || index < 0)
            throw  new IndexOutOfBoundsException();

        if(currentCell == null)
            return str + " null";
        while ( i != index){
            if(currentCell != null)
                currentCell = currentCell.getNextCell();
            i++;
        }
        CellContent+= currentCell.getValue();
        return str + CellContent;
  }


    public int sumLetter() {
      Cell currentCell = head;
      int somme = 0;
      if(currentCell == null)
          return somme;
      while (currentCell != null){
          somme = somme +  currentCell.getValue().length();
          currentCell = currentCell.getNextCell();
      }
      return somme;
    }
}


