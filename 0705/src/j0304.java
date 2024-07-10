public class j0304 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            String clap = "";
            String n = (i + "");
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) == '3' || n.charAt(j) == '6' || n.charAt(j) == '9') {
                    clap = clap.concat("jjak");
                }
            }
            if (!clap.isEmpty())
                System.out.println(i + " " + clap);
        }
    }
}