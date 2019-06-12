import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author xiaoliang
 * @since 2019-06-12
 */
public class ArrayTest {

    @Test
    public void returnImmediatelyWithArrayContainingUniqueElements() {
        assertThat(Array.unique(Array.of(1, 2, 3)), equalTo(Array.of(1, 2, 3)));
    }

    @Test
    public void removeDuplicationsWithArrayContainingSameElements() {
        assertThat(Array.unique(Array.of(1, 1)), equalTo(Array.of(1)));
        assertThat(Array.unique(Array.of(1, 1, 1)), equalTo(Array.of(1)));
    }
}
