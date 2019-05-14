import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FindElementTest {

    @Test
    public void should_return_true_if_element_existe_with_find_classic() {
        int [] ints = {1,2,3,30,99,100, 199};
        FindTheElementInCollection findTheElementInCollection = new FindTheElementInCollection();

        boolean result = findTheElementInCollection.checkIfTheElementExiste(ints, 30);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void should_return_false_if_element_not_existe_with_find_classic() {
        int [] ints = {1,2,3,30,99,100, 199};
        FindTheElementInCollection findTheElementInCollection = new FindTheElementInCollection();

        boolean result = findTheElementInCollection.checkIfTheElementExiste(ints, 900);

        assertThat(result).isEqualTo(false);
    }

    @Test
    public void should_return_false_if_element_not_existe_with_find_dichonomi() {
        int [] ints = {1,2,3,30,99,100, 199};
        FindTheElementInCollection findTheElementInCollection = new FindTheElementInCollection();

        boolean result = findTheElementInCollection.checkIfTheElementExistWithDichonomi(ints, 900);

        assertThat(result).isEqualTo(false);
    }

}
