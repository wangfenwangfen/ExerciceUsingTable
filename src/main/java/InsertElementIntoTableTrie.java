class InsertElementIntoTableTrie {

    int[] insertElementInTabTrie(int element, int[] ints) {
        //creer intsTab avec la taille plus grande
        int[] intsTab = new int[ints.length+1];

        copyValueInTab(ints, intsTab);

        if(element>ints[ints.length-1]){
            intsTab[intsTab.length-1] = element;
        }

        //parcourt la tab depuis le dernier element
        for (int index = ints.length - 1; index >= 0 ; index--) {
                if (element < ints[index]) {
                    //inserer l'element a partir du fin de table en l'ordre apres comparaison
                    intsTab[index + 1] = ints[index];
                    intsTab[index] = element;
                }
            }
        return intsTab;
    }

    private void copyValueInTab(int[] ints, int[] intsTab) {
        /*
        for(int i=0; i< ints.length; i++){
            intsTab[i] = ints[i];
        }
         */
        System.arraycopy(ints, 0, intsTab, 0, ints.length);
    }
}
