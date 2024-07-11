public class j03b03 {
    public static String draw_tree(int row, int left, int right) {
        String result = "";
        for (int i = 0; i < (right - left) + 1; i++){
            if (i == (right - left + 1)/2)
                System.out.print("X");
            System.out.print("-");
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
/*
* 20   10  5   2 : - 개수, //2
* 1    2   4   8 : x 개수, *2
* 위와 같은 모양을 출력하는 순환 함수 draw_tree(int row, int left, int right)를 설계
* 함수의 매개변수는 row와 left, right
* row은 ×를 그리는 행을 표시
* 가장 위에 있는 행이 0이고 아래로 내려갈수록 숫자는 증가한다고 생각하자.
* left와 right는 각각 주어진 영역의 왼쪽 끝과 오른쪽 끝을 나타낸다.
*
* draw_tree 함수는 주어진 행에서 주어진 영역의 중간 위치를 계산하고
* 중간 위에 ‘×’를 출력한 다음에
* 주어진 영역을 2개로 나누어 각각의 영역에 대하여 각각 draw_tree 함수를 순환 호출하면 된다.
*
* 0번째 행 : left(0)와 right(19)의 중간지점에 x 출력
* 영역을 2개로 나누기 : 2개의 영역
* 1번째 행 : left와 right의 중간 지점에 x 출력 (각 영역에)
* 2번째 행 : 4개의 영역
* 3번째 행 : 8개의 영역
*
*               1
*       2               2
*   3       3       3       3
* 4   4   4   4   4   4   4   4
* */