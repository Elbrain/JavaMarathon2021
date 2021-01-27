package day8;

import java.util.Date;

public class Task1 {
    static String str;
    static StringBuilder stringBuilder = new StringBuilder();
    static Date date = new Date();


    public static void main(String[] args) {
        concatenation();
        sbAppend();
    }

    public static void concatenation() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str = str + " " + i;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(str);
        System.out.printf("String build in %d %s",Math.abs(finishTime - startTime), "ms");
    }

    public static void sbAppend(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(" ").append(i);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(stringBuilder);
        System.out.printf("String build in %d %s",Math.abs(finishTime - startTime), "ms");
    }
}