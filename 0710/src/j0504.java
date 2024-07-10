import java.util.Scanner;

public class j0504 {
    public static void main(String[] args) {
//        StackApp.run();
    }
}
interface Stack {
    int length();   //  현재 스택에 저장된 개수
    int capacity(); // 스택의 전체 저장 가능한 개수
    String pop();   // 스택의 top에 실수 저장
    boolean push(String val);   // 스택의 top에 저장된 실수 리턴
}
//class StringStack implements Stack {
//    int capacity;
//    String[] stack;
//
//    public int length() { return stack.length; }
//
//    public int capacity() { return capacity; }
//
//    public String pop() {
//
//    }
//
//    public boolean push(String val) {
//        return stack[length()-1] = val;
//    }
//}
//class StackApp extends StringStack {
//    public static void run() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String str;
//        int i = 0;
//        while (true) {
//            str = sc.next();
//            if (str.equals("그만")) { break; }
//            if (push(str)) {
//                stack[i] = str;
//                i++;
//            }
//            else
//                System.out.println("스택이 꽉 차서 푸시 불가!");
//        }
//        System.out.println("스택에 저장된 모든 문자열 팝 :");
//        for (int i = 0; i < n; i++) {
//            System.out.print(" " + stack[i]);
//        }
//    }
//}