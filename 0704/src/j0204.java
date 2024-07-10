import java.util.Scanner;

public class j0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        String op = sc.next();
        float y = sc.nextFloat();

        switch (op) {
            case "+":
                System.out.println(x + " " + op + " " + y + " = " + (x + y));
                break;
            case "-":
                System.out.println(x + " " + op + " " + y + " = " + (x - y));
                break;
            case "*":
                System.out.println(x + " " + op + " " + y + " = " + (x * y));
                break;
            case "/":
                if (y == 0)
                    System.out.println("False");
                else
                    System.out.println(x + " " + op + " " + y + " = " + (x / y));
                break;
        }
    }
}
