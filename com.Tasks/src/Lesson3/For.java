package Lesson3;

public class For {
    public static void main(String[] args) {
        print(HELLO);
    }


    private static final String HELLO = "Hello world";

    static void print(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s);

        }

    }
}