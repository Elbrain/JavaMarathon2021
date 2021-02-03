package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("src/main/resources/shoes.csv");
        File fileOut = new File("src/main/resources/missing_shoes.txt");
        checkOrCreateFile(fileOut);
        List<String> infoFromFile = new ArrayList<>();
        readFromFileToList(infoFromFile, fileIn);
        writeFromListToFile(infoFromFile, fileOut);
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


    private static void readFromFileToList(List<String> infoFromFile, File file) {
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.endsWith(";0")) {
                    line = line.replace(";", ", ");
                    infoFromFile.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFromListToFile(List<String> infoFromFile, File fileOut) {
        try (PrintWriter pw = new PrintWriter(fileOut)) {
            for (String s : infoFromFile) {
                pw.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
