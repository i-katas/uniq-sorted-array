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
        for (int i = 0; i < end; i++) {
            int dups = 0;
            for (int last = i + 1; last <= end && array[i] == array[last]; last++) {
                dups++;
                System.arraycopy(array, last + 1, array, i + 1, end - last);
            }
            end -= dups;
        }
        return Arrays.copyOf(array, end + 1);
    }
}
