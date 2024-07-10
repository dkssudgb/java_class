import java.util.Scanner;

public class j0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 교수님 코드 : 삼항 연산자 이용
        boolean answer = ((a+b>c) && (a+c>b) && (b+c>a)) ? true : false;
        System.out.println(answer);

        // intellij 추천
        System.out.println(((a+b>c) && (a+c>b) && (b+c>a)));

        // 내 코드
        if (a + b > c && a + c > b && b + c > a)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
