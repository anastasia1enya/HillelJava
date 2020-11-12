package Lesson3;

public class TestTaskReverse {
    public static void main(String[] args) {
        int number = 1234;

        String str = String.valueOf(number);

        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println(sb.toString());

    }
}

