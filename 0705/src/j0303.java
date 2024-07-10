import java.util.Scanner;

public class j0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdefghijklmnopqrstuvwsyz";
        String a;
        while (true) {
            a = sc.next();
            if (s.contains(a))
                break;
            else
                System.out.println(-1);
        }
        int idx = s.indexOf(a);
        for (int i = idx; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}
