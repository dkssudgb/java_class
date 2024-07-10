import java.util.Scanner;

public class j0201_1 {
    public static void main(String[] args) {
//        해당 지폐보다 금액이 큰지에 대해서는 조건문 필요 X
//        n이 0이면 출력하지 않기 때문
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        int n = price / 50000;
        if (n > 1)
            System.out.println(n + " 50,000won bill(s)");
        else if (n == 1)
            System.out.println(n + " 50,000won bill");
        price %= 50000;

        n = price / 10000;
        if (n > 1)
            System.out.println(n + " 10,000won bill(s)");
        else if (n == 1)
            System.out.println(n + " 10,000won bill");
        price %= 10000;

        n = price / 1000;
        if (n > 1)
            System.out.println(n + " 1,000won bill(s)");
        else if (n == 1)
            System.out.println(n + " 1,000won bill");
        price %= 1000;

        n = price / 500;
        if (n > 1)
            System.out.println(n + " 500won coin(s)");
        else if (n == 1)
            System.out.println(n + " 500won coin");
        price %= 500;

        n = price / 100;
        if (n > 1)
            System.out.println(n + " 100won coin(s)");
        else if (n == 1)
            System.out.println(n + " 100won coin");
        price %= 100;

        n = price / 50;
        if (n > 1)
            System.out.println(n + " 50won coin(s)");
        else if (n == 1)
            System.out.println(n + " 50won coin");
        price %= 50;

        n = price / 10;
        if (n > 1)
            System.out.println(n + " 10won coin(s)");
        else if (n == 1)
            System.out.println(n + " 10won coin");
        price %= 10;

        if (price > 1)
            System.out.println(price + " 1won coin(s)");
        else if (price == 1)
            System.out.println(price + " 1won coin");
        sc.close();
    }
}
