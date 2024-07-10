import java.util.Scanner;

public class j0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // X2 < 100 || x1 > 200
        // y2 < 100 || y1 > 200
        if (x2 < 100 || x1 > 200 || y2 < 100 || y1 > 200)
            System.out.println("False");
        else
            System.out.println("True");
    }
}
// (100, 200)   (200, 200)
// (100, 100)   (200, 100)