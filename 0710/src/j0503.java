public class j0503 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class ColorPoint extends Point {
    String color = "BLACK";
    public ColorPoint() {
        super(0, 0);
    }
    public ColorPoint(int x, int y) {
        super(x, y);

    }
    @Override
    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
    protected void setXY(int x, int y) {
        super.move(x, y);
    }
    protected void setColor(String color) {
        this.color = color;
    }
}