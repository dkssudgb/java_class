public class j0404 {
    public static void main(String[] args) {
        DicApp dic = new DicApp();
    }
}
class Dictionary {
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        String result = "";
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word))
                result = eng[i];
        }
        if (!result.isEmpty())
            return result;
        else
            return "저의 사전에 없습니다.";
    }
}
class DicApp extends Dictionary {

}