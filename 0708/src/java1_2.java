public class java1_2 {
    static int[] matrix_diff(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] c = matrix_diff(a, b);
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
    }
}
