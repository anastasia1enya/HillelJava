package Lesson3;

import javax.swing.*;

public class TestTaskDeleteNumber {
    public static void main(String[] args) {
        int rem =2;
        int number = 121212;

        String[] split =String.valueOf(number).split("");
        //String res = "";
        StringBuilder res = new StringBuilder();
        for (String s: split) {
        if (Integer.parseInt(s)!=2){
            res.append(s);
        }
        }
        System.out.println(res);
    }
}
