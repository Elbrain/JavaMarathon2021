package day16;

import java.io.*;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        double counter = 0;
        double sum = 0.0;
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            line = bufferedReader.readLine();
            String[] info = line.split(" ");
            for (String s : info) {
                sum += Double.parseDouble(s);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("%.15f --> %.3f", sum / counter, sum / counter);
    }
}

