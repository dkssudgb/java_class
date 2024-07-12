import java.util.HashMap;
import java.util.Scanner;

public class j0703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager cm = new CustomerManager();
        String s;
        while (true) {
            s = sc.nextLine();
            if (s.equals("그만"))
                break;
            String name = s.split(" ")[0];
            int point = Integer.parseInt(s.split(" ")[1]);
            cm.put(name, point);
            cm.print();
        }
    }
}
class CustomerManager {
    HashMap<String, Integer> customers;
    public CustomerManager() {
        customers = new HashMap<String, Integer>();
    }
    public void put(String name, int point) {
        if (customers.containsKey(name))
            customers.put(name, customers.get(name) + point);
        else
            customers.put(name, point);
    }
    public void print() {
        for (String name : customers.keySet()) {
            System.out.print("(" + name + ", " + customers.get(name) + ")");
        }
        System.out.println();
    }
}