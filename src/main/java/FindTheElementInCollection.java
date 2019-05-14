import java.util.Arrays;

class FindTheElementInCollection {

    boolean checkIfTheElementExiste(int[]ints, int element){
        boolean existe = false;
        for (int anInt : ints) {
            if (anInt == element) {
                existe = true;
            }
        }
        return existe;
    }
    //Todo still not finished
    boolean checkIfTheElementExistWithDichonomi(int[] ints, int element){
        boolean exist;
        int indexDebut = 0;
        int indexFin = ints.length-1;
        int indexMiddle;

        do {
            indexMiddle = (indexDebut+indexFin)/2;

            exist = false;
            if (element == ints[indexMiddle]) {
                exist = true;
            }
            if (element > ints[indexMiddle]) {
                indexDebut = indexMiddle;
            }else {
                indexFin = indexMiddle;
            }
            System.out.println(ints[indexMiddle]);
        }while (element!=ints[indexMiddle] && stillHaveElementsInTab(indexDebut, indexFin));
        return exist;
    }

    private boolean stillHaveElementsInTab(int indexDebut, int indexFin) {
        return indexFin-indexDebut>=0;
    }

}
