import java.math.BigInteger;
import java.util.Scanner;

// 오버플로우 방지 : BigInteger
public class j03b01_1 {
    public static BigInteger factorial(int n) {
        if (n <= 1)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(factorial(n).mod(BigInteger.valueOf(1_000_000_007)));
        sc.close();
    }
}
