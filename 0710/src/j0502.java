import java.util.Scanner;

public class j0502 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다.");
        sc.close();
    }
}
class Km2Mile extends Converter {
    private double c;
    public Km2Mile(double c) {
        this.c = c;
    }
    public double convert(double src) { // 0.621371
        return src / c;
    }
    public String getSrcString() {
        return "km";
    }
    public String getDestString() {
        return "Mile";
    }
}