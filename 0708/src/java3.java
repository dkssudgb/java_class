import java.util.Scanner;

// hint) character로 입력받기 : scanner.next(i).charAt(0)
public class java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int small = 0;
        int big = 0;

        for (int i = 0; i < n; i++) {
            int c = sc.next().charAt(0);
            if (c >= 'a' && c <= 'z')
                small += 1;
            else if (c >= 'A' && c <= 'Z')
                big += 1;
        }
        System.out.println(small);
        System.out.println(big);
        sc.close();
    }
}
