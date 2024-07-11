import java.util.Scanner;

public class j0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            String str1 = str.substring(0, i + 1);
            String str2 = str.substring(i+1);
            for (int k = 0; k < str2.length(); k++) {
                System.out.print(str2.charAt(k));
            }
            for (int j = 0; j < str1.length(); j++) {
                System.out.print(str1.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}
