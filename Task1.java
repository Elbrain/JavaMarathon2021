package day14;

import java.io.*;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        int counter = 0;
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
                counter++;
            }
        } catch (IOException e) {
            System.err.println("Such file not found");
            e.printStackTrace();
        }
        if (counter != 10) {
            try {
                throw new IOException("Некорректный входной файл");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
    }
}
