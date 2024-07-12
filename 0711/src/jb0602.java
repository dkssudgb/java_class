import java.util.Scanner;

public class jb0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.next();
        String palin = "";

        origin = origin.strip().replaceAll("[@$^]", "").toLowerCase();
        for (int i = origin.length() - 1; i >= 0; i--) {
            palin += origin.charAt(i);
        }

        if (palin.equals(origin))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
