import java.util.Scanner;
import java.util.Vector;

public class j0702 {
    public static void print(Vector<Integer> v) {
        int avg = 0;
        for (Integer integer : v) {
            System.out.print(integer + " ");
            avg += integer;
        }
        avg /= v.size();
        System.out.println("\n" + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 0)
                break;
            v.add(n);
            print(v);
        }
    }
}
// 입력 : 강수량
// 출력 : 현재 입력된 모든 강수량, 현재 입력된 모든 강수량의 평균