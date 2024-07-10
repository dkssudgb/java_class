import java.util.Scanner;

public class j0505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        switch (op) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                if (div.calculate() == -1)
                    System.out.println("계산할 수 없습니다.");
                else
                    System.out.println(div.calculate());
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }
        sc.close();
    }
}
abstract class Calc {
    int a, b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract public int calculate();
}
class Add extends Calc {
    public int calculate() {
        return a + b;
    }
}
class Mul extends Calc {
    public int calculate() {
        return a * b;
    }
}
class Sub extends Calc {
    public int calculate() {
        return a - b;
    }
}
class Div extends Calc {
    public int calculate() {
        if (b == 0)
            return -1;
        return a / b;
    }
}