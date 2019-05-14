import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ChoseBiggestIntTest {
    @Test
    public void should_return_the_biggest_one() {

        int[] ints = {19, 55, 1, 2, 99,9, 97};
        SelecteurAvecTrieEnOrdre selector = new SelecteurAvecTrieEnOrdre();
        int result = selector.choseBiggest(ints);

        int expected = 99;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_tableau_croissante() {
        int[] ints = {19, 55, 1, 2, 99,9, 97};
        SelecteurAvecTrieEnOrdre selector = new SelecteurAvecTrieEnOrdre();

        selector.trierTableIntsByOrdreCroissanteWithArrays(ints);

        int[] expected = {1,2,9,19,55,97,99} ;
        Assertions.assertThat(ints).isEqualTo(expected);
    }

    @Test
    public void should_return_tableau_decroissante_when_use_arrays_reverser() {
        int[] ints = {19, 55, 1, 2, 99,9, 97};
        SelecteurAvecTrieEnOrdre selector = new SelecteurAvecTrieEnOrdre();

        ints = selector.trieDecroissantWithArraysSort(ints);

        int[] expected = {99,97,55,19,9,2,1} ;
        Assertions.assertThat(ints).isEqualTo(expected);
    }

    @Test
    public void should_return_tableau_croissante_with_trie_classic() {
        int[] ints = {19, 55, 1, 2, 99,9, 97};
        SelecteurAvecTrieEnOrdre selector = new SelecteurAvecTrieEnOrdre();

        selector.trierTableIntsByOrdreDecroissante(ints);

        int[] expected = {99,97,55,19,9,2,1} ;
        Assertions.assertThat(ints).isEqualTo(expected);
    }

}
