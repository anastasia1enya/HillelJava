package Lesson3;

public class TestTask1 {
    public static void main(String[] args) {
        int i = 123;
        String val =String.valueOf(i);
        char [] chars = val.toCharArray();
        int sum = 0;
        for (char c : chars){
            int in = Integer.valueOf(String.valueOf(c));
            if (in %2 ==0) sum +=in;
        }
        System.out.println(sum);
    }

}
