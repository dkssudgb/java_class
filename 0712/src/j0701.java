import java.util.Scanner;
import java.util.Vector;

public class j0701 {
    public static void printBig(Vector<Integer> v) {
        int max = 0;
        for (int i = 0; i < v.size(); i++) {
            if (max < v.get(i))
                max = v.get(i);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == -1)
                break;
            v.add(n);
        }
        printBig(v);
    }
}
