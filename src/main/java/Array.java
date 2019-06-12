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
        int i = 0;
        while (i < size - 1) {
            int last = i + 1;
            while (last < array.length && array[i] == array[last]) {
                size--;
                last++;
            }
            i++;
        }
        return Arrays.copyOf(array, size);
    }
}
