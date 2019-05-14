import java.util.Arrays;

public class PrintMains {
    public static void main(String[] args) {
        SelecteurAvecTrieEnOrdre selecteur = new SelecteurAvecTrieEnOrdre();
        int[] ints = {19, 55, 1, 2, 99,9, 97};
        selecteur.choseBiggest(ints);
        System.out.println("ordre trie croissant" + Arrays.toString(ints));

        selecteur.trierTableIntsByOrdreDecroissante(ints);
        System.out.println("ordre trie Decroissant" + Arrays.toString(ints));

        selecteur.trierTableIntsByOrdreCroissanteWithArrays(ints);
        System.out.println("ordre trie croissant" + Arrays.toString(ints));

        ints = selecteur.trieDecroissantWithArraysSort(ints);
        System.out.println("ordre trie Decroissant" +Arrays.toString(ints));

    }
}
