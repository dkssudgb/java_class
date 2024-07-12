import java.util.Vector;

public class j0704 {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor("beauty");
        ge.run();
    }
}
abstract class Shape {
    public abstract String draw();
}
class Line extends Shape {
    public String draw() {
        return "Line";
    }
}
class Rect extends Shape {
    public String draw() {
        return "Rect";
    }
}
class Circle extends Shape {
    public String draw() {
        return "Circle";
    }
}

class GraphicEditor {
    Vector<Shape> shapes = new Vector<Shape>();
    public GraphicEditor() {}
    public void run() {
        // 각 도형 클래스를 shapes에 add()
    }
}
/*
* 1 = 삽입
*   1 = Line
*   2 = Rect
*   3 = Circle

* 2 = 삭제
* 삭제할 도형의 위치 선택

* 3 = 모두 보기

* 4 = 종료
*/

/* 1 1 1 2 1 3 3 2 1 2 2 3 4
* 1 - 1
* 1 - 2
* 1 - 3
* 3 : Line \n Rect \n Circle
* 2 - 1
* 2 - 2 : 삭제할 수 없습니다.
* 3 : Line \n Circle
* 4 : 프로그램 종료
* */