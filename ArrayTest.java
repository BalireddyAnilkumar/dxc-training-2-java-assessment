public class ArrayTest {
    public boolean isUnique(int[] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i] == d[j])
                    return false;
            }
        }
        return true;
    }

    public static boolean isSorted(double[] array) {
        double pre = array[0];

        for (int i = 1; i < array.length; i++) {
            double current = array[i];
            if (pre >= current) {
                return false;
            }
            pre = current;
        }    return true;
    }
    public static int minimum(int[] values) {
        try {
            int min = values[0];
            if (values == null) {
                throw new NullPointerException();
            }

            if (values.length > 0) {
                for (int i = 1; i < values.length; i++) {
                    if (values[i] < min) {
                        min = values[i];
                    }
                }
                return min;
            } else {
                throw new ArrayIsEmptyException();
            }