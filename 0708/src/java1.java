import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 0;

        if (i == 10)
            j += 5;
        else {
            if (i == 20)
                j += 10;
            j += 100;
        }
        System.out.println(j);
        sc.close();
    }
}
