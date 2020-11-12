package Lesson3;

public class DoWhile {
    public static void main(String[] args) {
        /*int count =1;
        do {
            System.out.println("count is "+count);
            count++;
        } while (count<10);*/

        String pass = " wrong passwords";
        boolean result = false ;
        int counter = 0;
        do {
            if (pass.equals("1111") )result = true;
            counter++;
            System.out.println(pass + ":" + result);
        }while (!result && counter<5);


    }
}
