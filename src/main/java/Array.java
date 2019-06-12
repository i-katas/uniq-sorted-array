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
        if (array[0] == array[1]) {
            size--;
        }
        if (2 < array.length && array[0] == array[2]) {
            size--;
        }
        return Arrays.copyOf(array, size);
    }
}
