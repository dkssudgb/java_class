import java.util.Scanner;

public class jn0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
//            result[i] = idx + 1;
//            idx = idx + arr[idx];
            if (arr[idx] > 0) {

            }
        }
    }
}
// % 이용
//  0    1   2    3   4   5   6
//[ 3    2   1   -3  -1  -2  -4 ] : arr[(i + arr[i]) % n]
// 이미 맞춘 과녁 = 0, 0이 나오면 같은 방향으로 한 칸 더 이동