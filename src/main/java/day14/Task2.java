package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                checkAge(line);
                people.add(line);
            }
        } catch (IOException e) {
            System.err.println("Файл не найден");
            people.clear();
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
            people.clear();
        }
        return people;
    }

    public static void checkAge(String str) throws MyException {
        if (str.contains(" -")) {
            throw new MyException("Некорректный входной файл");
        }
    }
}