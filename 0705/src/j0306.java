import java.util.InputMismatchException;
import java.util.Scanner;
public class j0306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.print(n * m);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println(-1);
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}