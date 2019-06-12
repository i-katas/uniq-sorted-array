import java.util.Arrays;

/**
 * @author xiaoliang
 * @since 2019-06-12
 */
public class Array {
    public static int[] of(int... array) {
        return array;
    }

    public static int[] unique(int[] array) {
        int size = array.length;
        for (int i = 0, dups = 0; i < size; i++, size -= dups, dups = 0) {
            for (int last = i + 1; last < size && array[i] == array[last]; last++) {
                dups++;
            }
            System.arraycopy(array, i + dups + 1, array, i + 1, size - (i + dups + 1));
        }
        return Arrays.copyOf(array, size);
    }
}
