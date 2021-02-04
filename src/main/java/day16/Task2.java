package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        checkOrCreateFile(file1);
        checkOrCreateFile(file2);
        writeIntsToFile(file1);
        List<Double> doubles = collectInfoForDouble(file1);
        writeDoubleToFile(doubles, file2);
        printResult(file2);
    }

    private static void checkOrCreateFile(File fileOut) {
        try {
            if (fileOut.createNewFile()) {
                System.out.println("File created: " + fileOut.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntsToFile(File file) {
        Random random = new Random();
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < 1000; i++) {
                pw.print(random.nextInt(101) + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static List<Double> collectInfoForDouble(File file1) {
        List<Double> doubles = new ArrayList<>();
        try (FileReader reader = new FileReader(file1); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            line = bufferedReader.readLine();
            double localSum = 0;
            String[] info = line.split(" ");
            for (int i = 0; i <= info.length; i++) {
                if (i % 20 != 0 || i==0) localSum += Double.parseDouble(info[i]);
                else {
                    doubles.add(localSum / 20);
                    localSum = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doubles;
    }

    public static void writeDoubleToFile(List<Double> doubles, File file2) {
        try (PrintWriter pw = new PrintWriter(file2)) {
            for (Double d : doubles) {
                pw.print(d + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file2){
        double localSum = 0;
        try (FileReader reader = new FileReader(file2); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            line = bufferedReader.readLine();
            String[] info = line.split(" ");
            for (String s : info) {
                localSum += Double.parseDouble(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((int)localSum);
    }
}

