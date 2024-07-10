import java.util.Scanner;

public class j0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] course = {"Java", "C++", "HTML5", "ComputerStructure", "Android"};
        int[] score = {95, 88, 76, 62, 55};

        while (true) {
            String exist = "N/A";
            String sub = sc.next();
            if (sub.equals("-1"))
                break;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(sub)) {
                    exist = course[i] + " : " + score[i];
                    break;
                }
            }
            System.out.println(exist);
        }
        sc.close();
    }
}
