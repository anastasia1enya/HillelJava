package Lesson3;

public class FirstCount {

    public static void main(String[] args) {
        int number = 123456789;
        String n = String.valueOf(number);
        System.out.println(n);
        System.out.println(Integer.parseInt(n.substring(0,1)) +Integer.parseInt(n.substring(n.length()-1)));
        System.out.println();
    }
}
