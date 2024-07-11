import java.util.Scanner;

public class j0605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String modify;

        while (true) {
            modify = sc.nextLine();
            int mark = -1;
            if (modify.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            for (int i = 0; i < modify.length(); i++) {
                if (modify.charAt(i) == '!') {
                    mark = i;
                    break;
                }
            }
            if (mark == -1) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            String pre = modify.substring(0, mark);
            String post = modify.substring(mark + 1);
            int exist = -1;
            for (int i = 0; i < sb.length() - pre.length(); i++) {
                if (sb.substring(i, i + pre.length()).equals(pre)) {
                    exist = i;
                    break;
                }
            }
            if (exist == -1)
                System.out.println("찾을 수 없습니다!");
            else if (pre.isEmpty() || post.isEmpty()) {
                System.out.println("잘못된 명령입니다!");
            }
            else {
                sb.replace(exist, exist + pre.length(), post);
                System.out.println(sb);
            }
        }
        sc.close();
    }
}
