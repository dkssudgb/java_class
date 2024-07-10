import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 40)
            System.out.println("I can't make a diamond");
        else {
            for (int i = 0; i < (n * 2) + 1; i++) {
                System.out.print("*");
            }
        }
    }
}
/*
* n = 3 : 7줄
*
* 0 : 공백 x
* 1 :       [3]
* 2 :    [2][3][4]
* 3 : [1][2][3][4][5]
* 4 :    [2][3][4]
* 5 :       [3]
* 6 : 공백 x
*
* 공백 가장 많은 부분 :
* */