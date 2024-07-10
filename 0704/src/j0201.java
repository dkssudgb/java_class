import java.util.Scanner;

public class j0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price >= 50000) {
            int n = price / 50000;
            if (n > 1)
                System.out.println(n + " 50,000won bill(s)");
            else if (n == 1)
                System.out.println(n + " 50,000won bill");
            price %= 50000;
        }
        if (price >= 10000) {
            int n = price / 10000;
            if (n > 1)
                System.out.println(n + " 10,000won bill(s)");
            else if (n == 1)
                System.out.println(n + " 10,000won bill");
            price %= 10000;
        }
        if (price >= 1000) {
            int n = price / 1000;
            if (n > 1)
                System.out.println(n + " 1,000won bill(s)");
            else if (n == 1)
                System.out.println(n + " 1,000won bill");
            price %= 1000;
        }
        if (price >= 500) {
            int n = price / 500;
            if (n > 1)
                System.out.println(n + " 500won coin(s)");
            else if (n == 1)
                System.out.println(n + " 500won coin");
            price %= 500;
        }
        if (price >= 100) {
            int n = price / 100;
            if (n > 1)
                System.out.println(n + " 100won coin(s)");
            else if (n == 1)
                System.out.println(n + " 100won coin");
            price %= 100;
        }
        if (price >= 50) {
            int n = price / 50;
            if (n > 1)
                System.out.println(n + " 50won coin(s)");
            else if (n == 1)
                System.out.println(n + " 50won coin");
            price %= 50;
        }
        if (price >= 10) {
            int n = price / 10;
            if (n > 1)
                System.out.println(n + " 10won coin(s)");
            else if (n == 1)
                System.out.println(n + " 10won coin");
            price %= 10;
        }
        if (price > 1)
            System.out.println(price + " 1won coin(s)");
        else if (price == 1)
            System.out.println(price + " 1won coin");
        sc.close();
    }
}
