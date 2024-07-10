import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sec = sc.nextDouble();
        String[] times = {"분", "시간", "일"};
        String answer = (int)(sec%60) + "초";

        for (int i = 0; i < 3; i++) {
            sec = sec / 60;
            answer = (int)(sec%60) + times[i] + " " + answer;
        }
        System.out.println(answer);
        sc.close();
    }
}