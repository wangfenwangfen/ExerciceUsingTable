import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class InsertElementIntoTabTest {

    @Test
    public void should_return_the_table_trie_after_add_element_if_element_bigger_than_last() {
        int[] ints = {1,2,3,4,50,99,100};
        InsertElementIntoTableTrie insertElementIntoTableTrie = new InsertElementIntoTableTrie();
        int[] result = insertElementIntoTableTrie.insertElementInTabTrie(999, ints);
        int[] expected = {1,2,3,4,50,99,100,999};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_the_table_trie_after_add_element_if_element_smaller_than_first() {
        int[] ints = {1,2,3,4,50,99,100};
        InsertElementIntoTableTrie insertElementIntoTableTrie = new InsertElementIntoTableTrie();
        int[] result = insertElementIntoTableTrie.insertElementInTabTrie(0, ints);
        int[] expected = {0,1,2,3,4,50,99,100};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_the_table_trie_after_add_element() {
        int[] ints = {1,2,3,4,50,99,100};
        InsertElementIntoTableTrie insertElementIntoTableTrie = new InsertElementIntoTableTrie();
        int[] result = insertElementIntoTableTrie.insertElementInTabTrie(97, ints);
        int[] expected = {1,2,3,4,50,97, 99,100};
        assertThat(result).isEqualTo(expected);
    }


}
