import java.util.Scanner;

public class java1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] student = new String[5][3];
        int n = sc.nextInt();
        float avg = 0;

        for (int i = 0; i < n; i++) {
            student[i][0] = sc.next();
            student[i][1] = sc.next();
            student[i][2] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details for Student " + (i + 1) + ":");
            System.out.println("Student_Number: " + student[i][0]);
            System.out.println("Name: " + student[i][1]);
            System.out.println("Marks: " + String.format("%.2f", Float.parseFloat(student[i][2])));
            avg += Float.parseFloat(student[i][2]);
            System.out.println();
        }
        avg = avg / n;
        System.out.println("Average Marks of students: " + String.format("%.2f", avg));
    }
}
