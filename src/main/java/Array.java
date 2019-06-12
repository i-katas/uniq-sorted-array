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
        int last = 1;
        if (last < array.length && array[0] == array[last]) {
            size--;
        }
        if (last + 1 < array.length && array[0] == array[last + 1]) {
            size--;
        }
        return Arrays.copyOf(array, size);
    }
}
