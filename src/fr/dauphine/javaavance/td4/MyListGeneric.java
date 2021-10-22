package fr.dauphine.javaavance.td4;

public class MyListGeneric {
    private CellGeneric head = null;

    /**
     *
     * @param value
     */
    public void add(Object value) throws  NullPointerException{

        if(value == null)
            throw new NullPointerException();
        //Creation d'une Cell de stockage
        CellGeneric myHead = new CellGeneric(value);
        // Head deviens sa prochaine cell juste pour stocker head et cette Cell devient Head
        //donc la premier Cell de la liste
        myHead.setNextCellGeneric(head);
        head = myHead;
    }

    /**
     *
     * @return
     */

    //Modification de Size pas compris encore
    public int size(){
        int numberOfElements = 0;
        CellGeneric currentCell = head;
        //Tant que la Cell courant n'est pas null elle même alors j'ai au moins un element donc
        //je peux incrementer la valeur de numberOfElements
        while (currentCell != null){
            numberOfElements++;
            currentCell = currentCell.getNextCellGeneric();
        }
        return numberOfElements;
    }

    /**
     *
     * @return
     */
    public String toString(){
        // Initialiser ma Cell courant par le head
        CellGeneric currentCell = head;

        // String d'initialisation vide a laquelle s'ajoutera la valeur de la lsite
        String str = "";

        //Tant que la Cell courant n'est pas null elle même alors j'ai au moins un element donc
        //je peux afficher la valeur presente dans cette Cell
        while (currentCell != null){


            if (currentCell.getNextCellGeneric() == null) {
                str = str + currentCell.getValue();
            } else {
                str = str + currentCell.getValue() + ", ";
            }

            //Si la Cell courante n'est pas null et que la Cell vers laquelle elle pointe
            // n'est pas null alors elle devient ma Cell courante
            currentCell = currentCell.getNextCellGeneric();
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

        CellGeneric myEndCell = new CellGeneric(value);
        myEndCell.setNextCellGeneric(null);

        //Verification si la liste n'est pas vide alors on ajoute
        // le valeur dans la premiere Cell donc le Head
        if (head == null) {
            head = new CellGeneric(value);
            return;
        }

        // Sinon definition par defaut de head comme la derniere Cell de notre liste

        CellGeneric defaultEndCellOfList  = head;
        while (defaultEndCellOfList.getNextCellGeneric() != null){
            defaultEndCellOfList = defaultEndCellOfList.getNextCellGeneric();
        }
        //Une fois la derniere Cell atteinte on lui modifie sa prochaine Cellqui est normalement Null
        //Par notre nouvelle Cell qui doit être la derniere
        defaultEndCellOfList.setNextCellGeneric(myEndCell);
    }

    /**
     *
     * @param value valeur que l'on veut ajoutée dans la liste
     * @param index position de la cellule où ajouter value
     */

    public void add(String value, int index){
        CellGeneric currentCell = head;
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
                currentCell = currentCell.getNextCellGeneric();
            j++;
        }
        currentCell.getNextCellGeneric().setValue(value);
    }

    /**
     *
     * @param index
     * @return la valeur contenue dans la cellule à la position index dans la liste
     */
    public String get(int index) throws IllegalArgumentException {

        CellGeneric currentCell = head;
        String str = "";
        String  CellContent = "";
        int i = 0;
        if(index > this.size() || index < 0)
            throw  new IllegalArgumentException();

        if(currentCell == null)
            return str + " null";
        while ( i != index){
            if(currentCell != null)
                currentCell = currentCell.getNextCellGeneric();
            i++;
        }
        CellContent+= currentCell.getValue();
        return str + CellContent;
    }


//    public int sumLetter() {
//    }

    public boolean contains(Object verifObjet) {
        CellGeneric currentCellGeneric = head;
        if (head == null) {
            return false;
        } else {
            while (currentCellGeneric != null) {
                if (currentCellGeneric.getValue() == verifObjet)
                    return  true;
                currentCellGeneric = currentCellGeneric.getNextCellGeneric();

            }
        }
        return false;
    }

}
