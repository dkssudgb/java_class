import java.util.Scanner;

public class j0403 {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.run();
    }
}
class Phone {
    String[] name, tel;
}
class PhoneBook extends Phone {
    PhoneBook(){}
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            n = sc.nextInt();
            if (n > 0)
                break;
        }
        name = new String[n];
        tel = new String[n];

        for (int i = 0; i < n; i++) {
            this.name[i] = sc.next();
            this.tel[i] = sc.next();
        }
        while (true) {
            String search = sc.next();
            boolean found = false;
            if (search.equals("그만"))
                break;
            for (int i = 0; i < tel.length; i++) {
                if (name[i].equals(search)) {
                    System.out.println(name[i] + "의 번호는 " + tel[i] + " 입니다.");
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println(search + " 이 없습니다.");
        }
    }
}