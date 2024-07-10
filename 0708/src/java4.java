import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            n = sc.nextInt();
            if (n < 0 || n > 9)
                continue;
            else
                break;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 1; j--){
                if (j <= i)
                    System.out.print(j);
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}