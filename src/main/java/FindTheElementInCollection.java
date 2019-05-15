import java.util.Arrays;
import java.util.stream.IntStream;

class FindTheElementInCollection {

    boolean checkIfTheElementExiste(int[] ints, int element) {
        boolean existe = false;
        for (int anInt : ints) {
            if (anInt == element) {
                existe = true;
            }
        }
        return existe;
    }

    boolean checkIfTheElementExistWithDichonomi(int[] ints, int element) {

        int indexDebut = 0;
        int indexFin = ints.length - 1;
        int indexMiddle;

        if (element == ints[indexDebut] || element == ints[indexFin]) {
            return true;
        }
        //stillHaveElementsInTab(indexDebut, indexFin) && valueIsBetweenTheFirstAndLast(element, ints)
        while (stillHaveElementsInTab(indexDebut, indexFin)) {

            indexMiddle = (indexDebut + indexFin) / 2;

            if (element == ints[indexMiddle]) {
                return true;
            }
            if (element > ints[indexMiddle]) {
                indexDebut = indexMiddle;
            } else {
                indexFin = indexMiddle;
            }
        }
        return false;
    }

    private boolean stillHaveElementsInTab(int indexDebut, int indexFin) {
        return indexFin - indexDebut > 1;
    }

    private boolean valueIsBetweenTheFirstAndLast(int elementParam, int[] intsTab) {
        return intsTab[0] < elementParam && elementParam < intsTab[intsTab.length - 1];
    }

    boolean checkIfElementExistByUsingStream(int[] ints, int element){
        IntStream stream = Arrays.stream(ints);
        return stream.anyMatch(number -> number==element);
    }
}
