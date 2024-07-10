import java.util.Scanner;

public class j0402 {
    public static void main(String [] arg) {
        int x, y, w, h;
        Scanner scanner = new Scanner(System.in);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        x = scanner.nextInt();
        y = scanner.nextInt();
        w = scanner.nextInt();
        h = scanner.nextInt();
        Rectangle r = new Rectangle(x, y, w, h);
        x = scanner.nextInt();
        y = scanner.nextInt();
        w = scanner.nextInt();
        h = scanner.nextInt();
        Rectangle s = new Rectangle(x, y, w, h);
        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
class Rectangle {
    int x, y, w, h;
    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public int square() {
        return w * h;
    }
    public void show() {
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형\n", x, y, w, h);
    }
    public boolean contains(Rectangle r) {
        return r.x > x && (r.x+r.w) < (this.x+this.w) && r.y > y && (r.y+r.h) < (this.y+this.h);
    }
}

/*
(x, y+h)    ---     (x+w, y+h)
    |                    |
    |                    |
(x,  y )    ---     (x+w,  y )
*/
