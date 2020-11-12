package Lesson3;

public class While {
    public static void main(String[] args) {
        whileExample();


    }
    static void whileExample(){
        byte a =10;
        byte res = 0;
        while (a<=100){
            res += a--;
        }
        System.out.println(a);
        System.out.println(res);
    }

}

