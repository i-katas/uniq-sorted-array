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
        int end = array.length - 1;
        int i = 0;
        while (i < end) {
            int last = i + 1;
            while (last <= end && array[i] == array[last]) {
                System.arraycopy(array, last + 1, array, i + 1, end - last);
                end--;
            }
            i++;
        }
        return Arrays.copyOf(array, end + 1);
    }
}
