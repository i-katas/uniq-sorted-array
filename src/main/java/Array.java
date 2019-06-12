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
            while (last < size && array[i] == array[last]) {
                System.arraycopy(array, last + 1, array, i + 1, size - (last + 1));
                size--;
            }
            i++;
        }
        return Arrays.copyOf(array, size);
    }
}
